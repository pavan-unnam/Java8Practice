package Java8Practice.design.patterns.creational.prototype;

public abstract class Profession implements Cloneable {
	
	public int id;
	public String name;
	
	abstract void print();
	
	public Object cloneIng() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clone;
		
	}

}
