package Java8Practice.constructors.This;

public class ConstructorChaining {

	int rollno;
	String name, course;
	float fee;

	ConstructorChaining(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	ConstructorChaining(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}  
