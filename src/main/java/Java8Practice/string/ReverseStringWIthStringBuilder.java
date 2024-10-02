package Java8Practice.string;

public class ReverseStringWIthStringBuilder {
	
static StringBuilder sur;
	
	static StringBuilder toReverseString(String name) {
		StringBuilder sbf = new StringBuilder();
		sbf.append(name);
		sur = sbf.reverse();
		return sur;
	}

}
