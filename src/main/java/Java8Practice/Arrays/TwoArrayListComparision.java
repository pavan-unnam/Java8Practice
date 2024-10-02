package Java8Practice.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwoArrayListComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(8);
		
		
		list1.add(3);
		list1.add(5);
		list1.add(7);
		list1.add(9);
		
		List<Integer> l = list.stream().filter(b1->(list1.stream().anyMatch(b2 -> b2.equals(b1)))).collect(Collectors.toList());
		for(Integer in : l) {
			System.out.println(in);
		}
		
	}

}
