package Java8Practice.serialization;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
	
	private String name;
	private List<Subject> list;
	
	
	public Student(String name, List<Subject> list) {
		this.name = name;
		this.list = list;
	}
	
	

}
