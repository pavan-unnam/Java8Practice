package Java8Practice.tree.node;

public class MaxBinaryHeapOrMaxPriorityQueue {
	Integer heap [];
	int length;
	
	public MaxBinaryHeapOrMaxPriorityQueue(int capacity) {
		heap = new Integer[capacity+1];
		length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int size() {
		return length;
	}
	
	public void toPrint() {
		for(int i =1; i<heap.length; i++) {
			System.out.println(heap[i]);
		}
	}
	
	public void insert(int value) {
		if(length==heap.length -1) {
			resizeArray(2*heap.length);
		}
		length++;
		heap[length]=value;
		swim(length);
	}
	
	//bottom of reheapify technic to insert for MaxBinaryHeap it will compare nodes and which one is greater that will be parent node
	private void swim(int n) {
		while(n>1 && heap[n/2] < heap[n]) {
			int temp = heap[n];
			heap[n] = heap[n/2]; 
			heap[n/2] = temp;
			n = n/2;
		}
	}

	
	private void resizeArray(int capacity) {
		Integer[] temp = new Integer[capacity];
		for(int i = 0; i<heap.length;i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}

}
