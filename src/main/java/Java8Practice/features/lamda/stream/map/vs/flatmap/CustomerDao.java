package Java8Practice.features.lamda.stream.map.vs.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDao {
	
	public static List<Customer> toGetAll() {
		return Stream.of(new Customer(101, "pavan", "p@gmnail.com", Arrays.asList("1111112", "454788898766")),
				new Customer(104, "kavan", "k@gmnail.com", Arrays.asList("11134412", "454766566898766")),
				new Customer(102, "dada", "d@gmnail.com", Arrays.asList("14465461112", "454343438766")),
				new Customer(103, "baba", "b@gmnail.com", Arrays.asList("11325554612", "4543434898766")),
				new Customer(104, "cat", "t@gmnail.com", Arrays.asList("1124356112", "4547090766"))).collect(Collectors.toList());
	}
}
