package Java8Practice.constructors.This;

public class ThisWIthMethodChain {
	String name;
	ThisWIthMethodChain (String name) {
		this();
		this.name = name;
	}
	
	ThisWIthMethodChain () {
	}
	void toPrintName() {
		
		this.toGetterName();
		//we can use this for calling current class method 
		// explicitly if you are not using compiler automatically use this implicitly
	}
	
	void toGetterName() {
		System.out.println(name);
	}

}
