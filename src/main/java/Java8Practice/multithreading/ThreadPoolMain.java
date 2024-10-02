package Java8Practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		for(int i =0; i<10;i++) {
			Runnable ruunn = new WorkerThread(""+i);
			es.execute(ruunn);
		}
		
		es.shutdown();
		while(!es.isTerminated()) {
		}
		System.out.println("finished all threads");
	}

}
 