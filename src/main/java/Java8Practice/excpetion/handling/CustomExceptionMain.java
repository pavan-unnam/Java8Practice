package Java8Practice.excpetion.handling;

public class CustomExceptionMain {

	public static void main(String[] args) {
		
		try {
			//TestCustomException1.validate(10);
			TestCustomException2.validate(10);
		} catch (AgeNotGoodException e) {
			e.printStackTrace();
		}
	}

}
