package Java8Practice.hashing;

public class HashTable {
	HashNode [] bucket;
	private int noOfBuckets;
	private int size;
	
	
	public HashTable(int capacity) {
		this.noOfBuckets = capacity;
		bucket = new HashNode[capacity];
		this.size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	private static class HashNode<T> {
		private T key ;
		private T value;
		private HashNode<T> next;
		
		public HashNode(T key, T value) {
			this.key = key;
			this.value = value;
		}
		
	}
	
	
	public void put(Integer key, String value) {
		
		if(key == null || value == null) {
			throw new IllegalArgumentException();
		}
		
		int bucketIndex = getBuketIndex(key);
		HashNode head = bucket[bucketIndex];
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = bucket[bucketIndex];
		HashNode node = new HashNode(key, value);
		node.next = head;
		bucket[bucketIndex] = node;
		
	}
	
	private int getBuketIndex(Integer key) {
		return key % noOfBuckets;
	}
	
	public String get(Integer key) {
		if(key == null) {
			throw new IllegalArgumentException();
		}
		int buketIndex = getBuketIndex(key);
		HashNode head = bucket[buketIndex];
		while(head!= null) {
			if(head.key.equals(key)) {
				return (String) head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	public String remove(Integer key) {
		if(key == null) {
			throw new IllegalArgumentException();
		}
		int buketIndex = getBuketIndex(key);
		HashNode head = bucket[buketIndex];
		HashNode previous = null;
		while(head!= null) {
			if(head.key.equals(key)) {
				break;
			}
			previous = head;
			head = head.next;
		}
		if(head == null) {
			return null;
		}
		size--;
		if(previous != null) {
			previous.next = head.next;
		} else {
			bucket[buketIndex] = head.next;
		}
		return null;
	}

}
