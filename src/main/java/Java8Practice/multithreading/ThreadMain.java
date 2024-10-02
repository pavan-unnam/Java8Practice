package Java8Practice.multithreading;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		ThreadWithThreadClass ttc = new ThreadWithThreadClass();
		ttc.start();
		
		ThreadWithRunnable tr = new ThreadWithRunnable();
		Thread t = new Thread(tr);
		t.start();
		System.out.println(t.hashCode());
		Thread t1 = new Thread(tr);
		t1.start();
		//t1.start();
		System.out.println(t1.hashCode());
		
		//thread join
		ThreadJoin tj = new ThreadJoin();
		Thread tjoin1 = new Thread(tj);
		System.out.println(tjoin1.getName()+" "+tjoin1.getId() );
		tjoin1.start();
		//tjoin1.join(); other therads joins after current thread completed
		tjoin1.join(100);
		Thread tjoin2 = new Thread(tj);
		System.out.println(tjoin2.getName()+" "+tjoin2.getId() );
		tjoin2.start();
		
		Thread tjoin3 = new Thread(tj);
		System.out.println(tjoin3.getName()+" "+tjoin3.getId() );
		tjoin3.start();
		
		ThreadPriority tp = new ThreadPriority();
		Thread tPriority = new Thread(tp);
		Thread tPriority1 = new Thread(tp);
		Thread tPriority2 = new Thread(tp);
		tPriority.setPriority(Thread.MIN_PRIORITY);
		tPriority1.setPriority(Thread.MAX_PRIORITY);
		tPriority2.setPriority(Thread.NORM_PRIORITY);
		tPriority.start();
		tPriority1.start();
		tPriority2.start();
		
				
		
		
		
		
	}

}
