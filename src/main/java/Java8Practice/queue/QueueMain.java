package Java8Practice.queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue q1 = new Queue();
		q1.toEnqueue(20);
		q1.toEnqueue(10);
		q1.toPrint();
		q1.toDequeue();
		q1.toPrint();

	}

}
