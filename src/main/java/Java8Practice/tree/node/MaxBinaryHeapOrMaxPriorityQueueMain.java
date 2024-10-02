package Java8Practice.tree.node;

public class MaxBinaryHeapOrMaxPriorityQueueMain {

	public static void main(String[] args) {
		
		MaxBinaryHeapOrMaxPriorityQueue mbhompq = new MaxBinaryHeapOrMaxPriorityQueue(3);
		System.out.println(mbhompq.size());
		System.out.println(mbhompq.isEmpty());
		mbhompq.insert(10);
		mbhompq.insert(11);
		mbhompq.insert(5);
		mbhompq.insert(6);
		mbhompq.insert(15);
		//mbhompq.insert(22);
		mbhompq.toPrint();

	}

}
