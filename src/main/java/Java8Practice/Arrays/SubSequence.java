package Java8Practice.Arrays;

public class SubSequence {

	public static void main(String[] args) {
		String originalSeq = "abcde";
		String subSeq = "ace";
		int i = 0;
		int j=0;
		while(i<originalSeq.length() && j<subSeq.length()) {
			if(originalSeq.charAt(i) == subSeq.charAt(j)) {
				j++;
			}
			i++;
		}
		if(j==subSeq.length()) {
			System.out.println(true);
		}
	}

}
