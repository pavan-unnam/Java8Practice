package Java8Practice.stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack {
	private  ListNode<Integer> top;
	private int length;
	
	Stack(){
		this.top = null;
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
			this.next = null; 
		 }
		
	}
	
	public void push(int data) {
		ListNode<Integer> temp = new ListNode<Integer>(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		top=top.next;
		length--;
		return result;
	}
	
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result = top.data;
		return result;
	}
	

}
