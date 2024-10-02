package Java8Practice.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

//Ashcnorous communication
public class ProdcuerAndConsumer {

	public static void main(String[] args) {
		
		int BOUND = 10;
		int N_PRODUCERS = 3;
		int N_CONSUMERS = Runtime.getRuntime().availableProcessors();
		int poisonPill = Integer.MAX_VALUE;
		int poisonPillPerProducer = N_CONSUMERS / N_PRODUCERS;
		int mod = N_CONSUMERS % N_PRODUCERS;

		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(BOUND);

		for (int i = 1; i < N_PRODUCERS; i++) {
		    new Thread(new NumbersProducer(queue, poisonPill, poisonPillPerProducer)).start();
		}

		for (int j = 0; j < N_CONSUMERS; j++) {
		    new Thread(new NumbersConsumer(queue, poisonPill)).start();
		}

		//new Thread(new NumbersProducer(queue, poisonPill, poisonPillPerProducer + mod)).start();
		
		//DelayQueue example
		ExecutorService executor = Executors.newFixedThreadPool(2);
	    
	    BlockingQueue<DelayObject> queue2 = new DelayQueue<>();
	    int numberOfElementsToProduce = 2;
	    int delayOfEachProducedMessageMilliseconds = 500;
	    DelayQueueConsumer consumer = new DelayQueueConsumer(queue2, numberOfElementsToProduce);
	    DelayQueueProducer producer = new DelayQueueProducer(
	    		queue2, numberOfElementsToProduce, delayOfEachProducedMessageMilliseconds);

	    // when
	    executor.submit(producer);
	    executor.submit(consumer);

	    // then
	    try {
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    executor.shutdown();
	    
	    //with executor service print no of 100 ellements
	    ExecutorService executor1 = Executors.newFixedThreadPool(2);
	    NumbersProducer np = new NumbersProducer(queue, poisonPill, poisonPillPerProducer);
	    NumbersConsumer nc = new NumbersConsumer(queue, poisonPillPerProducer);
	 // when
	    executor1.submit(np);
	    executor1.submit(nc);
	    
	 // then
	    try {
			executor1.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    executor1.shutdown();
	    
	}

}
