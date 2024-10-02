package Java8Practice.design.patterns.structural.flyWieght;

public class FlyWeightTest {

	public static void main(String[] args) {
		Animal am = AnimalFactory.toGetCat("puppy");
		am.printAttributes();
		System.out.println(am);
		am = AnimalFactory.toGetCat("puppy");
		am.printAttributes();
		System.out.println(am);
		am = AnimalFactory.toGetCat("jack");
		am.printAttributes();
		System.out.println(am);
	}

}
