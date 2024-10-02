package Java8Practice.design.patterns.creational.builder;

public class Director {
	
	private Builder builder;
	
	
	Director(Builder builderType) {
		this.builder = builderType;
	}
	
	public Home getComplexHomeObject() {
		return this.builder.getComplexHomeObject();
	}
	
	public void manageHomeConstruction() {
		this.builder.buildFloor();
		this.builder.buildWalls();
		this.builder.buildTerrace();
	}
}
