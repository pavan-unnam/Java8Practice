package Java8Practice.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "two");
		map.put(1, "one");
		map.put(5, "five");
		
		map.keySet().stream().sorted((b1,b2)-> b2.equals(b1));
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.stream().filter(b1-> 
			b1%2!=0).collect(Collectors.toList());
	}

}
