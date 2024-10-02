package string.example;

public class WordCount {

	public static void main(String[] args) {
		String s="abctigtigergeftiger";
		String array1 [] = s.split("t");
		int count = 0;
		String [] array = new String[5];
		String s1= "";
		int j = 0;
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i) == 't') {
				array[j] = s.substring(i);
				j++;
			}
		}
		
		for(int x = 0; x<array.length; x++) {
			if(array[x] != null &&  array[x].contains("tiger")) {
				count++;
			}
		}
System.out.println(count);
	}

}
