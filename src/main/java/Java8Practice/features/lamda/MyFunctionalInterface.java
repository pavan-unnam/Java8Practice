package Java8Practice.features.lamda;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	void m1();
	void m5();
	
	default void m2() {
		System.out.println("method m2");
	}
	
	default void m3() {
		System.out.println("method m3");
	}
	

	static void m4() {
		System.out.println("method m4");
	}

}
