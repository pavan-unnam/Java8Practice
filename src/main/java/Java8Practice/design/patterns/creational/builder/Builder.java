package Java8Practice.design.patterns.creational.builder;

public interface Builder {
	
	void buildFloor();
	void buildWalls();
	void buildTerrace();
	
	public Home getComplexHomeObject();

}
