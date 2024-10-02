package Java8Practice.features.lamda.real.world;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("pubg", 1);
		map.put("freeFire", 2);
		map.put("crandy", 4);
		map.put("gamer", 3);
		
		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(list, (b1,b2)->(int)b1.getKey().compareTo(b2.getKey()));//asc
		System.out.println(list);
		Collections.sort(list, (b1,b2)->(int)b2.getValue().compareTo(b1.getValue()));//desc
		System.out.println(list);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
		Map<Employee, Integer> treeMap = new TreeMap<Employee, Integer>((b1,b2)->b1.getSalary().compareTo(b2.getSalary()));
		treeMap.put(new Employee(1, "pavan", "eng", 10000), 1);
		treeMap.put(new Employee(3, "darling", "ent", 50000), 2);
		treeMap.put(new Employee(2, "abc", "alzebra", 20000), 4);
		treeMap.put(new Employee(4, "bata", "sales", 30000), 3);
		System.out.println(treeMap);
		
		treeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(emp->emp.getSalary()))).forEach(System.out::println);;
		treeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);;

	}

}
