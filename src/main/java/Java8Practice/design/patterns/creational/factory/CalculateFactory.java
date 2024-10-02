package Java8Practice.design.patterns.creational.factory;

public class CalculateFactory {
	
	Calculate calculate;
	
	public Calculate toGetCalcualte(String type) {
		if(type.equals("Add")) {
			calculate = new Add();
		} else if(type.equals("Sub")) {
			calculate = new Sub();
		}
		return calculate;
		
	}

}
