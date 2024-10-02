package Java8Practice.design.patterns.creational.builder;

public class FloodBuilder implements Builder {
	
	private Home floodHome = new Home();

	@Override
	public void buildFloor() {
		this.floodHome.floor = "wooden fllor";
		
	}

	@Override
	public void buildWalls() {
		this.floodHome.walls = "wooden walls";
		
	}

	@Override
	public void buildTerrace() {
		this.floodHome.terrace = "wooden terrace";
		
	}

	@Override
	public Home getComplexHomeObject() {
		return this.floodHome;
	}

}
