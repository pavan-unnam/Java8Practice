package string.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		EMployee one = new EMployee("unnam", 10000);
		EMployee two = new EMployee("kumar", 20000);
		EMployee four  = new EMployee("unnam", 4000);
		EMployee three = new EMployee("Pavan", 30000);
		
		
		List<EMployee> list = new ArrayList<EMployee>();
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		
		 list.stream().sorted(Comparator.comparing(EMployee::getName)
				.thenComparing(EMployee::getSalaray)).collect(Collectors.toList());
		/*
		 * list.stream().sorted((b1,b2)->(int)b2.getName().compareTo(b1.getName()))
		 * .collect(Collectors.toList()) .sort((b1, b2) ->
		 * b2.getSalaray().compareTo(b1.getSalaray()));
		 */
		 
		 list = list.stream().sorted((b1,b2)->{
			 if(b2.getName() == b1.getName()) {
				return b2.getSalaray().compareTo(b1.getSalaray());
			 } else {
				return b2.getName().compareTo(b1.getName());
			 }
		 }).collect(Collectors.toList());
		
		for(EMployee emp : list) {
			System.out.println(emp.getName() +" " + emp.getSalaray());
		}

	}

}

 class EMployee {
	private String name;
	private Integer salaray;
	
	EMployee(String name, Integer salaray) {
		this.name = name;
		this.salaray = salaray;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalaray() {
		return salaray;
	}

	public void setSalaray(Integer salaray) {
		this.salaray = salaray;
	}
	
	
}
