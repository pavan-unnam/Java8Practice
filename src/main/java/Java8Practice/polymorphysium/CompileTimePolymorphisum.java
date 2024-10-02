package Java8Practice.polymorphysium;

public class CompileTimePolymorphisum {
	
	static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	static void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}

}
