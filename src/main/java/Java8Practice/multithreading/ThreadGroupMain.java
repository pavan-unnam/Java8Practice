package Java8Practice.multithreading;

public class ThreadGroupMain {

	public static void main(String[] args) {
		Runnable rn = new ThreadGroupEx();
		ThreadGroup tg = new ThreadGroup("Parent group");
		Thread t1 = new Thread(tg, rn, "one");
		t1.start();
		Thread t2 = new Thread(tg, rn, "two");
		t2.start();
		Thread t3 = new Thread(tg, rn, "three");
		t3.start();
		
		System.out.println(tg.getName());
		tg.list();
		
		Thread t4 = new Thread(rn);
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(t4);
		System.out.println("Now main sleeping... press ctrl+c to exit"); 
	}
	
}

class ThreadGroupEx implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
