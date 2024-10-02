package Java8Practice.constructors.Super;

public class ParentClass {
	String name = "pavan";
	
	ParentClass(){
		System.out.println("no-arg constructor of parent class");
	   }
	   //arg or parameterized constructor
	ParentClass(String str){
		System.out.println("parameterized constructor of parent class");
	   }
	void display() {
		System.out.println("Parenrt class");
	}
}
