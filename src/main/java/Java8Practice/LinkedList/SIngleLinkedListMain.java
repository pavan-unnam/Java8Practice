package Java8Practice.LinkedList;

public class SIngleLinkedListMain {

	public static void main(String[] args) {
		SIngleLinkedList sl = new SIngleLinkedList();
		sl.insertFirst(); //insert node at first
		sl.insertLast(); //insert node at last
		sl.insertIndexPosition(30, 1);
		sl.toDIsplay();
		System.out.println(sl.toFindLength());
		sl.deleteFirst();
		sl.toDIsplay();
		System.out.println(sl.toFindLength());
		sl.deleteLast();
		sl.toDIsplay();
		sl.deleteAtPosition(1);
		sl.toDIsplay();
		System.out.println(sl.toCheckValuesIsPresent(11));
		System.out.println(sl.toReverse());
		
		SIngleLinkedList s2 = new SIngleLinkedList();
		System.out.println("second object");
		s2.insertFirst(); //insert node at first
		s2.toDIsplay();
		s2.toFIndMiddleForEvenSize();
		s2.insertLast();
		s2.toFIndMiddleForEvenSize(); //odd numbers
		s2.toFIndNthSize(3);
		s2.toFIndNthFromLast(2);
		//s2.toRemoveDuplicates();
		
		SIngleLinkedList s3 = new SIngleLinkedList();
		System.out.println("third object");
		s3.insertLast();
		s3.toDIsplay();
		System.out.println(s3.toFindLength());
		s3.insertLast();
		s3.toDIsplay();
		s3.toRemoveDuplicatesSorted();
		s3.toDIsplay();
		s3.toInsertDataInSortedWay();
		s3.toDIsplay();
		s3.toRemoveDataInSortedWay(22);
		s3.toDIsplay();
		System.out.println(s3.toDeletctLoop());
	}

}
