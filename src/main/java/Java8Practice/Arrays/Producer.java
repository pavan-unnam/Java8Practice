package Java8Practice.Arrays;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	BlockingQueue<Integer> queue;
	
	Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}


	@Override
	public void run() {
			int data = 0;
			try {
				queue.put(data++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
