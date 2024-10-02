package Java8Practice.design.patterns.creational.factory;

public class Add implements Calculate {

	@Override
	public void toCalculate(int a, int b) {
		System.out.println("sum :"+(a+b));
	}

}
