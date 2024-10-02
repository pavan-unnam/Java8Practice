package Java8Practice.design.patterns.structural.proxy;

public class ProxyClass extends RealSubjectClass{
	
	@Override
	public void method() {
		System.out.println("hi doing proxy autentcation before caling real implementaion");
		super.method();
	}

}
