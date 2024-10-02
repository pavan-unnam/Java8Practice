package Java8Practice.Arrays;

import java.util.HashSet;
import java.util.Set;

public class VowelsRemovalProblem {

	public static void main(String[] args) {
		String name = "pavankumar";
		char ch [] = name.toCharArray();
		StringBuilder sb = new StringBuilder();
		Set<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		for(Character c : ch) {
			if(!vowels.contains(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());		

	}

}
