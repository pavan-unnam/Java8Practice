package Java8Practice.design.patterns.creational.abstarct.factory;

public class AbstarctFactoryProfession extends AbsractFactory {
	Profession profession;
	
	public Profession getProfession(String type) {
		if(type.equals("Eng")) {
			profession = new Engineer();
		} else if(type.equals("Teacher")) {
			profession = new Teacher();
		}
		return profession;
	}

}
