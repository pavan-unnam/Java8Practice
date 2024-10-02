package Java8Practice.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class DelayQueueConsumer implements Runnable {
    private BlockingQueue<DelayObject> queue;
    private Integer numberOfElementsToTake;
    public AtomicInteger numberOfConsumedElements = new AtomicInteger();

    // standard constructors
    public DelayQueueConsumer(BlockingQueue<DelayObject> queue, Integer numberOfElementsToTake) {
		super();
		this.queue = queue;
		this.numberOfElementsToTake = numberOfElementsToTake;
		
	}

    @Override
    public void run() {
        for (int i = 0; i < numberOfElementsToTake; i++) {
            try {
                DelayObject object = queue.take();
                numberOfConsumedElements.incrementAndGet();
                System.out.println("Consumer take: " + object);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

	
}
