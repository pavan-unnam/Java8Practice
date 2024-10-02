package Java8Practice.queue;

import java.util.NoSuchElementException;

public class Queue {
	ListNode<Integer> exit;
	ListNode<Integer> rear;
	private int length;
	
	Queue() {
		exit = null;
		rear = null;
		length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int toGetLength() {
		return length;
	}
	
	private static class ListNode<T> {
		private T data;
		private ListNode<T> next;
		
		 @SuppressWarnings("unused")
		ListNode(T data) {
			this.data = data;
			this.next = null; 
		 }
	}
	
	public void toEnqueue(int data) {
		ListNode<Integer> newNode = new ListNode<Integer>(data);
		if(isEmpty()) {
			exit = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		length++;
	}
	
	public void toPrint() {
		if(isEmpty()) {
			return;
		}
		ListNode<Integer> current = exit;
		while(current!= null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}
	
	public int toDequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		int result = exit.data;
		exit = exit.next;
		if(exit == null) {
			rear = null;
		}
		length --;
		return result;
	}

}
