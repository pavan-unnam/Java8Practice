package Java8Practice.interface2;

import Java8Practice.interface1.Interface2;

public class DiifrentPackgeImplementsInterface2 implements Interface2 {

	@Override
	public void toPrintName() {
		System.out.println("public method with body so interface wil give error ");
		
	}

	@Override
	public void toGetName() {
		System.out.println("private method with body so interface wil give error ");
		
	}

	@Override
	public void toFetchName() {
		System.out.println("default method with body so interface wil give error ");
		
	}

	@Override
	public void showName() {
		System.out.println("protected method with body so interface wil give error ");
		
	}

	@Override
	public void data() {
		System.out.println("public final method with body so interface wil give error ");
		
	}

	@Override
	public void dum() {
		System.out.println("private final method with body so interface wil give error ");
		
	}

	@Override
	public void nut() {
		System.out.println("proetcted final method with body so interface wil give error ");
		
	}

	@Override
	public void toRamt() {
		System.out.println("default final method with body so interface wil give error ");
		
	}

	@Override
	public void demo3() {
		System.out.println("publlic abstarct method without body so interface wil works fine");
		
	}

	@Override
	public void demo5() {
		System.out.println("default abstarct method without body so interface wil works fine");
		
	}

	@Override
	public void demo6() {
		System.out.println("private abstarct method without body so interface wil give error");
		
	}

	@Override
	public void demo7() {
		System.out.println("protected abstarct method without body so interface wil give error");
		
	}

	@Override
	public void demo4() {
		System.out.println("default abstarct method without body so interface will works fine");
		
	}

}
