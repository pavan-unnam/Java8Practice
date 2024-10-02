package Java8Practice.excpetion.handling;

public class AgeNotGoodException extends RuntimeException {
	
	AgeNotGoodException(String str) {
		super(str);
	}
}
