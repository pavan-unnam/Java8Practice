package Java8Practice.design.patterns.creational.factory;

public class Sub implements Calculate {

	@Override
	public void toCalculate(int a, int b) {
		System.out.println("sub : " + (a-b));
	}

}
