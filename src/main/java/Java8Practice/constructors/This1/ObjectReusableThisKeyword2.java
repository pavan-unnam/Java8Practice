package Java8Practice.constructors.This1;

public class ObjectReusableThisKeyword2 {
	String name;
	public ObjectReusableThisKeyword2(String name) {
		this.name = name;
	}
	
	 public void toPerform() {
		 ObjectReusableThisKeyword3 w = new ObjectReusableThisKeyword3();
		 w.toPrint(this);
	 }

}
