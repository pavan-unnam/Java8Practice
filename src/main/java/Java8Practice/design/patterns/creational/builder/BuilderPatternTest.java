package Java8Practice.design.patterns.creational.builder;

public class BuilderPatternTest {

	public static void main(String[] args) {
		Builder earthQuakeBuilder = new EarthQuakeBuilder();
		Director dir = new Director(earthQuakeBuilder);
		dir.manageHomeConstruction();
		Home home = dir.getComplexHomeObject();
		System.out.println(home.floor);
	}

}
