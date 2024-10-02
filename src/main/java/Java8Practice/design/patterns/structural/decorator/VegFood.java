package Java8Practice.design.patterns.structural.decorator;

public class VegFood implements Food {

	@Override
	public String prepareFood() {
		return "very good";
	}

	@Override
	public double goodPrice() {
		// TODO Auto-generated method stub
		return 50;
	}

}
