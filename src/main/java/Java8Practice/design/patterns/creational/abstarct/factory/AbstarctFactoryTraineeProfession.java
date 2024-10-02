package Java8Practice.design.patterns.creational.abstarct.factory;

public class AbstarctFactoryTraineeProfession extends AbsractFactory {
	
Profession profession;
	
	public Profession getProfession(String type) {
		if(type.equals("TrainEng")) {
			profession = new TraineeEngineer();
		} else if(type.equals("TrainTeacher")) {
			profession = new TraineeTeacher();
		}
		return profession;
	}

}
