package Java8Practice.design.patterns.creational.builder;

public class EarthQuakeBuilder implements Builder {

	private Home eathQuakeHome = new Home();

	@Override
	public void buildFloor() {
		this.eathQuakeHome.floor = "wooden fllor";
		
	}

	@Override
	public void buildWalls() {
		this.eathQuakeHome.walls = "wooden walls";
		
	}

	@Override
	public void buildTerrace() {
		this.eathQuakeHome.terrace = "wooden terrace";
		
	}

	@Override
	public Home getComplexHomeObject() {
		return this.eathQuakeHome;
	}
}
