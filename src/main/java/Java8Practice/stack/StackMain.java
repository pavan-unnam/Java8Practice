package Java8Practice.stack;

public class StackMain {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.peek());
	}
}
