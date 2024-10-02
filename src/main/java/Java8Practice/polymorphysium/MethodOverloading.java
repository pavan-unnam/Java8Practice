package Java8Practice.polymorphysium;

public class MethodOverloading {
	
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	// order of parameters
	void sum(int a, String name) {
		System.out.println(a+""+name);
	}
	
	void sum( String name, int a) {
		System.out.println(a+""+name);
	}
	// differ no of arguments
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	// differ datatype
	void sum(String name) {
		System.out.println(name);
	}
	
	//promotion of primitive
	void sub(int a, long b) {
		System.out.println(a-b);
	}
	
	void sub(int a, int b) {
		System.out.println(a-b+1);
	}
	
	//it causes the ambiguity problem
	void sub( long b, int a) {
		System.out.println(a-b);
	}
	

}
