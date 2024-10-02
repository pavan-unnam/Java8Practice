package Java8Practice.string;

public class ReverseStringWithCharArray {

	static void toReverseString(String name) {
		char[] strAsCharArray = name.toCharArray();
		for (int i = strAsCharArray.length-1; i >= 0; i--) {
           System.out.println(strAsCharArray[i]);
		}
	}
}
