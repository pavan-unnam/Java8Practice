package Java8Practice.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversStringWithArrayList {
	
	static void toReverseString(String name) {
		char[] strAsCHarArray = name.toCharArray();
		List<Character> trial1 = new ArrayList<>();
        for (char c : strAsCHarArray)
            trial1.add(c);
 
        Collections.reverse(trial1);
       for(char c1: trial1) {
    	   System.out.print(c1);
       }
	}

}
