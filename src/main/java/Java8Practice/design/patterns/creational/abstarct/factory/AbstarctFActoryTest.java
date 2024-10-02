package Java8Practice.design.patterns.creational.abstarct.factory;

public class AbstarctFActoryTest {

	public static void main(String[] args) {
		AbsractFactory abstarctFactory = AbstarctFactoryProducer.toGetProfession(true);
		Profession prf = abstarctFactory.getProfession("Eng");
		prf.print();

	}

}
