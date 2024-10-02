package Java8Practice.multithreading;

public class LockMain {

	public static void main(String[] args) {
		
		LockTest test = new LockTest();
		Thread t1 = new Thread(test);
		t1.start();
		Thread t2 = new Thread(test);
		t2.start();
	}

}

class LockTest implements Runnable {
	int count =0;

	@Override
	public void run() {
		synchronized (this) {
			count++;
			System.out.println(count);
		}
		
	}
	
}
