package Java8Practice.circle.single.linkedList;

import java.util.NoSuchElementException;

public class CircularLinkedList {
	ListNode<Integer> last;
	int length;
	
	public CircularLinkedList() {
		this.last = null;
		this.length = 0;
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
		 }
		
	}
	
	public void  toFindLength() {
		int count = 0;
		ListNode<Integer> current = last.next;
		while (current != null && current!= last) {
			count++;
			current = current.next;
		}
		length=count+1;
	}
	
	public void toInsertData() {
		ListNode<Integer> first = new ListNode<Integer>(10);
		ListNode<Integer> second = new ListNode<Integer>(20);
		ListNode<Integer> third = new ListNode<Integer>(30);
		ListNode<Integer> fourth = new ListNode<Integer>(40);
		 first.next = second;
		 second.next = third;
		 third.next=fourth;
		 fourth.next=first;
		 
		 last = fourth;
	}
	
	public void  toDisplay() {
		if(last == null) {
			return;
		}
		ListNode<Integer> first = last.next;
		while (first != null && first!= last) {
			System.out.println(first.data);
			first = first.next;
		}
		System.out.println(last.data);
	}
	
	public void  toInsertAtFirst(int data) {
		ListNode<Integer> newNode = new ListNode<Integer>(data);
		if(last == null) {
			last = newNode ;
		} else {
			newNode.next = last.next;
		}
		last.next = newNode;
	}
	
	public void  toInsertAtLast(int data) {
		ListNode<Integer> newNode = new ListNode<Integer>(data);
		if(last == null) {
			last = newNode ;
			last.next = last;
		} else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void  toDeleteAtFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode<Integer> temp = last.next;
		if(last.next == last) {
			last = null;
		} else {
			last.next = temp.next;
		}
		temp.next = null;
	}
	
	public void  toDeleteAtLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode<Integer> temp = last.next;
		if(last.next == last) {
			last = null;
		} else {
			while(temp.next !=last) {
				temp = temp.next;
			}
			temp.next = last.next;
			last = temp;
		}
	}

}
