package Java8Practice.string;

public class ReverseStringWithBytes {
	
	static String toReverseString(String name) {
		byte[] strAsByteArray = name.getBytes();
		byte[] result = new byte[strAsByteArray.length];
		for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
		}
		return new String(result);
	}
	

}
