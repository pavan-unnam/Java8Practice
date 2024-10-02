package Java8Practice.features.lamda.stream.map.vs.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import Java8Practice.features.lamda.real.world.Employee;
import Java8Practice.features.lamda.real.world.EmployeeDao;

public class MapReduceDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2, 3,4,5);
		Integer sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	    sum = list.stream().mapToInt(i->i).sum();
		System.out.println(sum);
		
		sum = list.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
		Optional<Integer> sum1 = list.stream().reduce(Integer::sum);
		System.out.println(sum1.get());
		
		int max = list.stream().reduce((a,b)->a<b?a:b).get();
		System.out.println(max);
		
		Optional<Integer> min = list.stream().reduce(Integer::min);
		System.out.println(min.get());
		
		List<String> Stringlist = Arrays.asList("pavan","kumar", "data","dont fly","james bond");
		String name = Stringlist.parallelStream().reduce((word1, word2)->word1.length()<word2.length()?word1:word2).get();
		System.out.println(name);
		
		List<Employee> empList = EmployeeDao.toGetEmployees();
		double avg = empList.parallelStream().filter(emp -> emp.getDept().equalsIgnoreCase("eng")).mapToInt(emp->emp.getSalary()).average().getAsDouble();
		System.out.println(avg);
	}

}
