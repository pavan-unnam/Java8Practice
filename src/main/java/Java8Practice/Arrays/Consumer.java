package Java8Practice.Arrays;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<Integer> queue;
	
	Consumer(BlockingQueue<Integer> queue) {
		this.queue=queue;
	}
	

	@Override
	public void run() {
		queue.poll();
		
	}

}
