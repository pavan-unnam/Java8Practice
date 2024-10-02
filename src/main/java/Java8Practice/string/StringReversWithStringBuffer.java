package Java8Practice.string;

public class StringReversWithStringBuffer {
static StringBuffer sur;
	
	static StringBuffer toReverseString(String name) {
		StringBuffer sbf = new StringBuffer();
		sbf.append(name);
		sur = sbf.reverse();
		return sur;
	}

}
