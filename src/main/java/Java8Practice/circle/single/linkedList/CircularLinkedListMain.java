package Java8Practice.circle.single.linkedList;

public class CircularLinkedListMain {

	public static void main(String[] args) {
		CircularLinkedList csl = new CircularLinkedList();
		csl.toInsertData();
		csl.toFindLength();
		System.out.println(csl.toGetLength());
		csl.toDisplay();
		csl.toInsertAtFirst(3);
		csl.toDisplay();
		csl.toInsertAtLast(33);
		csl.toDisplay();
		System.out.println("deletion process started");
		csl.toFindLength();
		System.out.println(csl.toGetLength());
		csl.toDeleteAtFirst();
		csl.toDisplay();
		csl.toDeleteAtLast();
		csl.toDisplay();

	}

}
