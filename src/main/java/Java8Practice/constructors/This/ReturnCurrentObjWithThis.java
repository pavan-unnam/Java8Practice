package Java8Practice.constructors.This;

public class ReturnCurrentObjWithThis {
	
	ReturnCurrentObjWithThis() {
		
	}
	
	ReturnCurrentObjWithThis getReturnCurrentObj() {
		return this;
	}
	 void printOb() {
		 System.out.println("return onbj");
	 }

}
