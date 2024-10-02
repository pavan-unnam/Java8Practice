package Java8Practice.constructors.This;

public class ObjectReusableThisKeyword {
	String name;
	public ObjectReusableThisKeyword(String name) {
		this.name = name;
	}
	
	 public void toPerform() {
		 ObjectReusableThisKeyword1 w = new ObjectReusableThisKeyword1();
		 w.toPrint(this);
	 }

}
