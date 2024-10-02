package Java8Practice.features.lamda.real.world;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public static List<Employee> toGetEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "pavan", "eng", 10000));
		list.add(new Employee(2, "kumar", "sales", 30000));
		list.add(new Employee(3, "unnam", "eng", 50000));
		list.add(new Employee(4, "boss", "IT", 20000));
		list.add(new Employee(5, "king", "eng", 40000));
		return list;
		
	}

}
