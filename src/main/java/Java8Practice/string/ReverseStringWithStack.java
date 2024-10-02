package Java8Practice.string;

import java.util.Stack;

public class ReverseStringWithStack {
	
static String sur="";
	
	static String toReverseString(String name) {
		Stack<Character> s = new Stack<Character>();
		char[] ch = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            s.push(ch[i]);
        }
        while (!s.isEmpty())
        {
        	sur = (String) (sur+s.pop());
        }
        return sur;
	}

}
