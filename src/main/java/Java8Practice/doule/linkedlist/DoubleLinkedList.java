package Java8Practice.doule.linkedlist;

import java.util.NoSuchElementException;

public class DoubleLinkedList {
	
	private ListNode<Integer> head;
	private ListNode<Integer> second;
	private ListNode<Integer> third;
	private ListNode<Integer> tail;
	private int length;
	
	public DoubleLinkedList() {
		this.head = null;
		this.tail = null;
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
		private ListNode<T> previous;
		
		 @SuppressWarnings("unused")
		ListNode(T data) {
			this.data = data;
		 }
		
	}
	
	public void toDIsplayForward() {
		ListNode<Integer> current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void toDIsplayBackward() {
		ListNode<Integer> current = tail;
		while (current != null) {
			System.out.println(current.data);
			current = current.previous;
		}
	}
	
	public void toInsertData() {
		 head = new ListNode<Integer>(10);
		 second = new ListNode<Integer>(20);
		 third = new ListNode<Integer>(30);
		 tail = new ListNode<Integer>(40);
		 head.next = second;
		 second.next = third;
		 third.next=tail;
		 tail.previous=third;
		 third.previous = second;
		 second.previous = head;
	}
	
	public void  toFindLength() {
		int count = 0;
		ListNode<Integer> current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		length=count;
	}
	
	public void  toInsertFirst(int data) {
		ListNode<Integer> newNode = new ListNode<Integer>(data);
		if(isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void  toInserLast(int data) {
		ListNode<Integer> newNode = new ListNode<Integer>(data);
		if(isEmpty()) {
			tail = newNode;
		} else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
	}
	
	public void  toDeleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode<Integer> temp = head;
		if(head==tail) {
			tail = null;
		} else {
			head.next.previous=null;
		}
		head = head.next;
		temp.next = null;
	}
	
	public void  toDeleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode<Integer> temp = tail;
		if(head==tail) {
			tail = null;
		} else {
			tail.previous.next=null;
		}
		tail = tail.previous;
		temp.previous = null;
	}

}
