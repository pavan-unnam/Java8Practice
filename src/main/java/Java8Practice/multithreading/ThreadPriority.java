package Java8Practice.multithreading;

public class ThreadPriority implements Runnable {

	@Override
	public void run() {
		System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	}

}
