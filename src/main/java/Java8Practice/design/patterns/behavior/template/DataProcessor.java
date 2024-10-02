package Java8Practice.design.patterns.behavior.template;

public abstract class DataProcessor {
	
	public void readAndProcessAndSave() {
		read();
		process();
	}
	
	public abstract void read();
	public abstract void process();
	
	public void save() {
		System.out.println("save the Db");
	}
	
	

}
