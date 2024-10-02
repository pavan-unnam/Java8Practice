package Java8Practice.design.patterns.structural.facade;

public class Iphone implements MobileShop {

	@Override
	public void mobileNo() {
		System.out.println("iphone");
	}

	@Override
	public void price() {
		System.out.println("100000");
	}

}
