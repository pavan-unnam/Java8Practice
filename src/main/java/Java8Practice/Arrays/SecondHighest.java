package Java8Practice.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,4,2,3,9,5};
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(9);
		list.add(5);
	
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i =0; i<list.size()-1; i++) {
			if(list.get(i)>list.get(i+1)) {
				list1.add(i+1);
				list1.add(i);
				i=-1;
			}
		}
		list1.get(list1.size()-2);
	}
	
	
	List<Integer> list3 = new LinkedList<Integer>();
	
	

}
