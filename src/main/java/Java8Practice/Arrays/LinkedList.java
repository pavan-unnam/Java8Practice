package Java8Practice.Arrays;

public class LinkedList {
	
	public ListNode listNode;
	
	public class ListNode {
		int data;
		static ListNode next;
		
		
		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
		
		public Integer length() {
			int count = 0;
			if(ListNode.next!= null) {
				count++;
			}
			return count;
			
		}
		
		public Integer toFindTheMiddle() {
			int length = length();
			int mid = length/2;
			return mid;
			
		}
		
	}

}
