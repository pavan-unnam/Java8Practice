package Java8Practice.multithreading;

public class ThreadJoin implements Runnable {
	
	public void printElements() {
		for(int i =0; i < 10 ; i++) {
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());  
		printElements();
	}

}
