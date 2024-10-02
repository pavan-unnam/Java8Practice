package Java8Practice.design.patterns.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Logger log = Logger.getInstance();
		Logger log1 = Logger.getInstance();
		System.out.println("singlton even create mutiple object hash code is common");
		System.out.println(log.hashCode() + " " +log1.hashCode());

	}

}
