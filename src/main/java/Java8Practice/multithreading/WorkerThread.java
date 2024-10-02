package Java8Practice.multithreading;

public class WorkerThread implements Runnable {
	
	private String message;
	public WorkerThread(String str) {
		this.message = str;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"start(Message) " +message);
		processMessage();
		System.out.println(Thread.currentThread().getName()+"end");
		
	}

	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
