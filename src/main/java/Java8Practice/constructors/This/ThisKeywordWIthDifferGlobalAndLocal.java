package Java8Practice.constructors.This;

public class ThisKeywordWIthDifferGlobalAndLocal {
	String name ;
	
	ThisKeywordWIthDifferGlobalAndLocal (String name) {
		this.name = name;
		//either we can use this operator to differ the instance and local variable
		//or use diffrentae names of instance and localvaraibles
	}
	
	void toPrintName() {
		System.out.println(name);
	}

}
