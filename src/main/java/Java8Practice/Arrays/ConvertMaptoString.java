package Java8Practice.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMaptoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> addit = new HashMap<String, Object>();
		addit.put("data", "sdf");
		addit.put("math", "ndf");
		//String s = addit
		 String mapAsString = addit.keySet().stream().map(key-> key + "=" + addit.get(key)).collect(Collectors.joining(", ", "{", "}"));
		 
		System.out.println(mapAsString);
		Map<String, Object> addit1 = new HashMap<String, Object>();
		addit.put("name", "pdf");
		addit.put("push", "pop");
		 String mapAsString1 = addit1.keySet().stream().map(key-> key + "=" + addit1.get(key)).collect(Collectors.joining(", ", "{", "}"));
		List<String> list = new ArrayList<>();
		list.add(mapAsString);
		list.add(mapAsString1);
		String mapAsString2 = String.join(",", list);
		System.out.println(mapAsString2);
		

	}

}
