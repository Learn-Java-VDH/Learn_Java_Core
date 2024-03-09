package CollectionPackage;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SetExam.addData();
//		SetExam.examTreeset();
//		ListExample.addData();
//		ArrayDequeExample.addData();
		// Tạo một ArrayList không đồng bộ hóa
		List<String> nonThreadSafeList = new ArrayList<>();

		// Tạo một ArrayList được đồng bộ hóa sử dụng Collections.synchronizedList
		List<String> threadSafeList = Collections.synchronizedList(new ArrayList<>());

		// Tạo và chạy các luồng thực hiện thêm phần tử vào danh sách không đồng bộ hóa
		Runnable addToNonThreadSafeList = () -> {
			for (int i = 0; i < 5; i++) {
				nonThreadSafeList.add("NonThreadSafe-" + i);
			}
		};

		// Tạo và chạy các luồng thực hiện thêm phần tử vào danh sách được đồng bộ hóa
		Runnable addToThreadSafeList = () -> {
			for (int i = 0; i < 5; i++) {
				threadSafeList.add("ThreadSafe-" + i);
			}
		};

		// Tạo và chạy các luồng
		Thread thread1 = new Thread(addToNonThreadSafeList);
		Thread thread2 = new Thread(addToNonThreadSafeList);
		Thread thread3 = new Thread(addToThreadSafeList);
		Thread thread4 = new Thread(addToThreadSafeList);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		// Chờ các luồng hoàn thành
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// In kết quả
		System.out.println("Non-thread-safe list size: " + nonThreadSafeList.size());
		System.out.println("Thread-safe list size: " + threadSafeList.size());

	}

}
