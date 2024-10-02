package Java8Practice.features.lamda;

public class LamdaTest {

	public static void main(String[] args) {
		CalculatorImpl imple = new CalculatorImpl();
		//Zero parameter lamda
		imple.calculate();
		//with parameters
		imple.perform();
		
		//with return type
		imple.performWithReturnType();
	}

}
