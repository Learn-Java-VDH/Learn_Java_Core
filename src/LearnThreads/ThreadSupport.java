package LearnThreads;

import java.util.concurrent.locks.LockSupport;

class ParkUnparkExample {

}

public class ThreadSupport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(() -> {
			for (int i = 1; i < 10; i++) {
				System.out.println("Luồng đang park " + i);
				if(i == 2) {		
					LockSupport.park(); // Luồng sẽ park ở đây
				}else {
					
				}

			}
			System.out.println("Luồng đã được unpark");
		});

		thread.start();

		try {
			Thread.sleep(2000); // Ngủ trong 2 giây
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		LockSupport.unpark(thread); // Unpark luồng

	}

}
