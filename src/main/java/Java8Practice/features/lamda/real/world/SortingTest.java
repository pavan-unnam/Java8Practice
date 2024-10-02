package Java8Practice.features.lamda.real.world;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(4);
		Collections.sort(list);//asc
		System.out.println(list);
		Collections.reverse(list);//desc
		System.out.println(list);
		
		list.stream().sorted().forEach(t->System.out.println(t));//asc
		list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));//desc
		
		List<Employee> empList = EmployeeDao.toGetEmployees();
		Collections.sort(empList, (b1,b2)->(int)b1.getSalary().compareTo(b2.getSalary()));//asc
		System.out.println(empList);
		Collections.sort(empList, (b1,b2)->(int)b2.getSalary().compareTo(b1.getSalary()));//desc
		System.out.println(empList);
		
		System.out.println("stream");;
		empList.stream().sorted((b1,b2)->(int)b1.getSalary().compareTo(b2.getSalary())).forEach(t->System.out.println(t));//asc
		System.out.println(empList);
		empList.stream().sorted((b1,b2)->(int)b2.getSalary().compareTo(b1.getSalary())).forEach(t->System.out.println(t));//desc
		System.out.println(empList);
		
		empList.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(t->System.out.println(t));//asc
		empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(t->System.out.println(t));//asc
		

	}

}
