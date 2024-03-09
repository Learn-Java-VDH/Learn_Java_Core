package LearnThreads;

class A extends Thread {
	public void show() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " A");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.show();
	}
}

class B extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.show();

	}

	public void show() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " B");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyRunnable implements Runnable {
	private int count = 100;





	public void run() {
		for (int i = 0; i < 10; i++) {
			this.count -= 1;
			System.out.println(this.count + " " + Thread.currentThread().getName());

		}
	}

}

class C extends A {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " C");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class LearnThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new A();
//		B b = new B();
//		C c = new C();
//		b.setPriority(Thread.MAX_PRIORITY);
//		a.start();
//		b.start();
//		c.start();

		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my);
		Thread t2 = new Thread(my);

		
		t1.start();
		t2.start();
		
//			t1.join();
//			t2.join();
		System.out.println("Hello");
		
	}

}
