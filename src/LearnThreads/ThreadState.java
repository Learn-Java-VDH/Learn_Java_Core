package LearnThreads;

class SharedResource {
    private int data;
    private boolean isDataAvailable = false;

    public synchronized void produceData(int value) {
        // Wait for the data to be consumed
        while (isDataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        // Produce data
        data = value;
        if(data == 4) {
        	
			isDataAvailable = true;
        }
        System.out.println("Produced: " + data);

        // Notify the waiting consumer
        notify();
    }

    public synchronized void consumeData() {
        // Wait for the data to be produced
        while (!isDataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        // Consume data
        System.out.println("Consumed: " + data);
        isDataAvailable = false;

        // Notify the waiting producer
        notify();
    }
}
public class ThreadState {

	 public static void main(String[] args) {
	        SharedResource sharedResource = new SharedResource();

	        // Producer thread
	        Thread producerThread = new Thread(() -> {
	            for (int i = 1; i <= 5; i++) {
	                sharedResource.produceData(i);
	                try {
	                    Thread.sleep(1000); // Simulate some processing time
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        // Consumer thread
	        Thread consumerThread = new Thread(() -> {
	            for (int i = 1; i <= 5; i++) {
	                sharedResource.consumeData();
	                try {
	                    Thread.sleep(1000); // Simulate some processing time
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        producerThread.start();
	        consumerThread.start();

	        try {
	            producerThread.join();
	            consumerThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

}



//isDataAvailable: Biến này là một cờ để xác định xem có dữ liệu nào có sẵn để tiêu thụ không. Nếu isDataAvailable là false, có nghĩa là không có dữ liệu nào được sản xuất, và thread tiêu thụ phải chờ.
//
//while (!isDataAvailable): Vòng lặp while kiểm tra giá trị của isDataAvailable. Nếu isDataAvailable là false, vòng lặp sẽ tiếp tục chạy, và thread tiêu thụ sẽ tiếp tục chờ.
//
//wait(): Nếu isDataAvailable là false, thread tiêu thụ gọi wait(). Điều này làm cho thread tiêu thụ chuyển vào trạng thái chờ đợi và giải phóng lock được sở hữu. Điều này cho phép bất kỳ thread nào khác có thể giữ lock trên đối tượng để tiếp tục hoạt động.
//
//catch (InterruptedException e): Nếu thread đang chờ bị ngắt (interrupted), nó sẽ bắt ngoại lệ InterruptedException. Trong trường hợp này, thread sẽ được đánh thức và quay lại trạng thái chạy, và cờ interrupt của nó sẽ được thiết lập. Sau đó, thread kiểm tra cờ interrupt (Thread.currentThread().interrupt()) và trả về, đảm bảo rằng thread sẽ kết thúc nếu bị interrupt.