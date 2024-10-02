package Java8Practice.features.lamda.real.world;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("pavan");
		list.add("kumar");
		list.add("Unnam");
		list.add("naba");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		for(String s : list) {
			if(s.startsWith("p"))
			System.out.println(s);
		}
		
		list.stream().forEach(t->System.out.println(t));
		list.stream().filter(s->s.startsWith("p")).forEach(t->System.out.println(t));
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "pavan");
		map.put(2, "kumar");
		map.put(3, "unnam");
		map.put(4, "naba");
		map.forEach((key, value) -> System.out.println(key +" : " + value));
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
		

	
		

	}

}
