package Java8Practice.constructors;

public class NoargConstructExample {
	
	private NoargConstructExample () {
		
	}
	
	private NoargConstructExample(String no) {
		this();
	}
	
	
	public void classic() {
		System.out.println("movie");
	}
}

class NoargConstructExample1 {
	private NoargConstructExample1 () {
		
	}
	
	private NoargConstructExample1(String no) {
		
	}
	
	public void classic() {
		System.out.println("movie");
	}
}
