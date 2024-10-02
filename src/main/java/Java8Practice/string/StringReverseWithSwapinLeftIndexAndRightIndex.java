package Java8Practice.string;

public class StringReverseWithSwapinLeftIndexAndRightIndex {
	
	static void toReverseString(String name) {
		char [] ca = name.toCharArray();
		int left, right = 0;
		right = ca.length-1;
		for(left = 0; left < right; left++, right--) {
			// Swap values of left and right
            char temp = ca[left];
            ca[left] = ca[right];
            ca[right] = temp;
		}
		for (char c : ca)
            System.out.print(c);
	}

}
