package Java8Practice.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class HasATestSerialize {

	public static void main(String[] args) throws IOException {
		
		Subject sub = new Subject("Phy");
		Subject sub2 = new Subject("Maths");
		
		List<Subject> list = new ArrayList<Subject>();
		list.add(sub);
		list.add(sub2);
		
		Student s = new Student("pavan", list);
		
		 //Saving of object in a file
	     FileOutputStream fos = new FileOutputStream("abc.ser");
	     ObjectOutputStream oos = new ObjectOutputStream(fos);
	           
	     // Method for serialization of B's class object
	     oos.writeObject(s);
	           
	     // closing streams
	     oos.close();
	     fos.close();
	           
	     System.out.println("Object has been serialized");
		

	}

}
