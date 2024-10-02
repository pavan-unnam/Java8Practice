package Java8Practice.string;

public class StringReverseWithCharAt {
	static String sur = "";
	
	static String toReverseString(String name) {
		for(int i=name.length()-1;i>=0;i--) {
			sur = sur+name.charAt(i);
		}
		return sur;
	}

}
