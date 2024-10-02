package Java8Practice.features.lamda.stream.map.vs.flatmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<Customer> list = CustomerDao.toGetAll();
		
		//one to one mapping 
		List<String> stringList = list.stream().map(customer->customer.getEmail()).collect(Collectors.toList());
		System.out.println(stringList);
		
		//one to one manyMaaping this i swrong way
		List<List<String>> phonerList = list.stream().map(customer->customer.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phonerList);
		
		//one to one manyMaaping
		List<String> phones = list.stream().flatMap(customer->customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		 System.out.println(phones);
		 
		 
		 List<String> list1 = new ArrayList<String>();
		 list1.add("aab");
		 list1.add("bc");
		 
		 List<String> result = list1.stream().filter((key)-> key.contains("a")).collect(Collectors.toList());
		 System.out.println(result.size());
	}

}
