package Java8Practice.hashing;

public class HashTableMain {

	public static void main(String[] args) {
		
		HashTable ht = new HashTable(10);
		ht.put(1, "name");
		ht.put(21, "class");
		ht.put(4, "object");
		System.out.println(ht.size());
		System.out.println(ht.get(1));
		ht.remove(21);
		System.out.println(ht.size());

	}

}
