package Java8Practice.doule.linkedlist;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		DoubleLinkedList ds = new DoubleLinkedList();
		ds.toInsertData();
		ds.toFindLength();
		System.out.println(ds.toGetLength());
		ds.toDIsplayForward();
		ds.toDIsplayBackward();
		ds.toInsertFirst(5);
		ds.toDIsplayForward();
		ds.toInserLast(50);
		ds.toDIsplayForward();
		ds.toDeleteFirst();
		ds.toDeleteLast();
		ds.toDIsplayForward();
	}

}
