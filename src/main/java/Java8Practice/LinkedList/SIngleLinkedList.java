package Java8Practice.LinkedList;

public class SIngleLinkedList {
	
	private ListNode<Integer> head;
	private ListNode<Integer> second;
	private ListNode<Integer> third;
	
	SIngleLinkedList () {
		// insert into into single linkedlist
		head = new ListNode<Integer>(10);
		second = new ListNode<Integer>(11);
		third = new ListNode<Integer>(12);
		head.next = second;
		second.next = third;
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
	
	public void toDIsplay() {
		ListNode<Integer> current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public int  toFindLength() {
		int count = 0;
		ListNode<Integer> current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insertFirst() {
		ListNode<Integer> newNode = new ListNode<Integer>(20);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertLast() {
		ListNode<Integer> newNode = new ListNode<Integer>(20);
		if(head == null) {
			head = newNode;
		}
		ListNode<Integer> current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public ListNode<Integer> deleteFirst() {
		if(head == null) {
			return null;
		}
		
		ListNode<Integer> temp = head;
		head = head.next;
		temp.next=null;
		return temp;
	}
	
	public ListNode<Integer> deleteLast() {
		if(head == null || head.next == null) {
			return null;
		}
		ListNode<Integer> current = head;
		ListNode<Integer> previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	public ListNode<Integer> deleteAtPosition(int position) {
		if(position == 0 &&(head == null || head.next == null)) {
			head = head.next;
		}
		ListNode<Integer> previous = head;
		int count = 1;
		while(count < position) {
			previous = previous.next;;
			count++;
		}
		ListNode<Integer> current = previous.next;
		previous.next = current.next;
		return previous;
	}
	
	public void insertIndexPosition(int data, int position) {
		ListNode<Integer> newNode = new ListNode<Integer>(data);
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			ListNode<Integer> previous = head;
			int count = 1;
			while (count < position) {
				previous = previous.next;
				count++;
			}
			
			ListNode<Integer> current = previous.next;
			newNode.next = current;
			previous.next = newNode;
		}
		
	}
	
	public boolean toCheckValuesIsPresent(int value) {
		ListNode<Integer> current = head;
		while(current.next!=null) {
			if(current.data==value) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public ListNode<Integer> toReverse() {
		ListNode<Integer> current = head;
		ListNode<Integer> previous = null;
		ListNode<Integer> next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current=next;
		}
		
		while (previous != null) {
			System.out.println(previous.data);
			previous = previous.next;
		}
		return previous;
		
	}
	
	public ListNode<Integer> toFIndMiddleForEvenSize(){
		ListNode<Integer> slowItr = head;
		ListNode<Integer> fastItr = head;
		while(fastItr != null && fastItr.next!=null) {
			slowItr = slowItr.next;
			fastItr = fastItr.next.next;
		}
		System.out.println(slowItr.data);
		return slowItr;
		
	}
	
	public ListNode<Integer> toFIndNthSize(int index){
		ListNode<Integer> mainItr = head;
		ListNode<Integer> refItr = head;
		int count = 0;
		while(count < index) {
			refItr = refItr.next;
			count++;
		}
		System.out.println(refItr.data);
		return refItr;
		
	}
	
	public ListNode<Integer> toFIndNthFromLast(int index){
		ListNode<Integer> mainItr = head;
		ListNode<Integer> refItr = head;
		int count = 0;
		while(count < index) {
			refItr = refItr.next;
			count++;
		}
		
		while(refItr!= null) {
			refItr = refItr.next;
			mainItr = mainItr.next;
		}
		System.out.println(mainItr.data);
		return mainItr;
	}
	
	public ListNode<Integer> toSortDesc() {
		ListNode<Integer> mainItr = head;
		ListNode<Integer> sorted = mainItr;
		 while(mainItr != null && mainItr.next != null) {
				 if(mainItr.data >= mainItr.next.data) {
					 sorted = mainItr;
					 mainItr = mainItr.next;
				 }
		 }
		return sorted;
	}
	
	public ListNode<Integer> toRemoveDuplicatesSorted() {
		ListNode<Integer> current = head;
	   while(current != null && current.next != null) {
		   if(current.data == current.next.data) {
			   current.next = current.next.next;
		   } else {
			   current = current.next;
		   }
		   
	   }
	return current;
		
	}
	
	public ListNode<Integer> toRemoveDuplicates() {
		ListNode<Integer> current = head;
	   while(current != null && current.next != null) {
		   if(current.data != current.next.data) {
			   current.next = current.next.next;
		   }
	   }
	return current;
	}
	
	public ListNode<Integer> toInsertDataInSortedWay() {
		ListNode<Integer> newNode = new ListNode<Integer>(22);
		ListNode<Integer> current = head;
		ListNode<Integer> temp = null;
		while(current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		 temp.next = newNode;
		 return head;
	}
	
	public ListNode<Integer> toRemoveDataInSortedWay(int data) {
		ListNode<Integer> current = head;
		ListNode<Integer> temp = null;
		while(current != null && current.data != data) {
			temp = current;
			current = current.next;
		}
		if(current == null)
			return head;
		 temp.next = current.next;
		 return head;
	}
	
	public boolean toDeletctLoop() {
		ListNode<Integer> fastItr = head;
		ListNode<Integer> slowItr = head;
		while(fastItr!= null && fastItr.next!= null) {
			fastItr = fastItr.next.next;
			slowItr = slowItr.next;
			if(slowItr == fastItr) {
				return true;
			}
		}
		return false;
	}
	
	public ListNode<Integer> toDeletctStartPointLoop() {
		ListNode<Integer> fastItr = head;
		ListNode<Integer> slowItr = head;
		while(fastItr!= null && fastItr.next!= null) {
			fastItr = fastItr.next.next;
			slowItr = slowItr.next;
			if(slowItr == fastItr) {
				return toGetStartPointLoop(slowItr);
			}
		}
		return null;
	}
	
	public ListNode<Integer> toGetStartPointLoop(ListNode<Integer> slowItr) {
		ListNode<Integer> temp = head;
		while(temp != slowItr) {
			temp = temp.next;
			slowItr = slowItr.next;
		}
		return temp;
	}
	
	public ListNode<Integer> toDeleteStartPointLoop() {
		ListNode<Integer> fastItr = head;
		ListNode<Integer> slowItr = head;
		while(fastItr!= null && fastItr.next!= null) {
			fastItr = fastItr.next.next;
			slowItr = slowItr.next;
			if(slowItr == fastItr) {
				return toRemoveLoop(slowItr);
			}
		}
		return null;
	}

	private ListNode<Integer> toRemoveLoop(ListNode<Integer> slowItr) {
		ListNode<Integer> temp = head;
		while(slowItr.next != temp.next) {
			temp = temp.next;
			slowItr = slowItr.next;
		}
		return slowItr.next = null;
	}


}
