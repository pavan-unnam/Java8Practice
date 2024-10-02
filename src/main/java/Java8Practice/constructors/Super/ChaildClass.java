package Java8Practice.constructors.Super;

public class ChaildClass extends ParentClass {
	String name = "kumar";
	
	
	ChaildClass () {
		super("kumar1");
		System.out.println("child Constructors");
	}
	void toPrintName() {
		System.out.println(super.name+""+name);
		display();
		super.display();
	}
	
	void display() {
		System.out.println("child class");
	}

}
