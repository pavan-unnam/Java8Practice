package Java8Practice.design.patterns.structural.proxy;

public class RealSubjectClass implements Subject {

	@Override
	public void method() {
		System.out.println("proxy design pattren");
	}

}
