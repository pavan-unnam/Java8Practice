package Java8Practice.HasA.releation;

import java.util.ArrayList;
import java.util.List;

public class AssociationMain {

	public static void main(String[] args) {
		
		// one to one relation
		Passport p = new Passport();
		Person p1 = new Person(p);
		
		//one to many relation
		Patients p2 = new Patients();
		List<Patients> plist = new ArrayList<Patients>();
		plist.add(p2);
		
		Doctor d = new Doctor(plist);
		
		// many to one relation
		// list of books having single libarary
		
		Books b = new Books();
		
		List<Books> blist = new ArrayList<Books>();
		blist.add(b);
		
		Libarary l = new Libarary(blist);
		
		// many to many relations
		
		Students s = new Students();
		
		List<Students> slist = new ArrayList<Students>();
		slist.add(s);
		Teacher t = new Teacher(slist);
		
		List<Teacher> tlist = new ArrayList<Teacher>();
		tlist.add(t);
		
		s.getListofTeachers(tlist);
		
		

	}

}
