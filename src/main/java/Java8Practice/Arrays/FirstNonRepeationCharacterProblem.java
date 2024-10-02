package Java8Practice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeationCharacterProblem {

	public static void main(String[] args) {
		String arry = "racecars";
		char ch [] = arry.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character c : ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i =0;i<ch.length;i++) {
			if(map.get(ch[i]) == 1) {
				System.out.println(ch[i]);
				break;
			}
		}
	}

}
