package Java8Practice.features.lamda.stream.map.vs.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer(104, "kavan", "data@gmail.com", Arrays.asList("11134412", "454766566898766"));
		
		Optional<Object> empty = Optional.empty();
		System.out.println(empty);
		
		//Optional<Object> of = Optional.of(customer.getEmail()); /// it will check null internally
		//System.out.println(of);

		
		Optional<String> ofNull = Optional.ofNullable(customer.getEmail()); /// it will allow nullable
		if(ofNull.isPresent()) {
		System.out.println(ofNull.get());
		}
		
		//second approach instead of isPresent
		System.out.println(ofNull.orElse("d@innoviti.com"));
		System.out.println(ofNull.orElseGet(()->"email not present"));
		System.out.println(ofNull.orElseThrow(()->new IllegalArgumentException("email not present")));
		
		System.out.println(ofNull.map(String::toUpperCase).get());
		getEMailList("a@innoviti.com");
	}
	
	
	static Customer getEMailList(String inpuemail) {
		List<Customer> customers = CustomerDao.toGetAll();
		return customers.stream().filter(customer->customer.getEmail().equals(inpuemail)).findAny().orElseGet(()->new Customer());
		
	}
		

}
