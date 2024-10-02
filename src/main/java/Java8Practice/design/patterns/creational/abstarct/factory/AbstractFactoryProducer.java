package Java8Practice.design.patterns.creational.abstarct.factory;

public class AbstractFactoryProducer {
	
	static AbsractFactory abstarctFActory;
	public static  AbsractFactory toGetProfession(boolean isTrue) {
		if(isTrue) {
			abstarctFActory = new AbstarctFactoryProfession();
		} else {
			abstarctFActory = new AbstarctFactoryTraineeProfession();
		}
		return abstarctFActory;
	}
}
