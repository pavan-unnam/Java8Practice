package Java8Practice.features.lamda.real.world;

import java.sql.DatabaseMetaData;
import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
	public List<Employee> toGetEmployees() {
		EmployeeDao.toGetEmployees().stream().filter(emp->emp.getSalary()>30000).forEach(emp->System.out.println(emp));
		return EmployeeDao.toGetEmployees().stream().filter(emp->emp.getSalary()>30000).collect(Collectors.toList());
	}

}
