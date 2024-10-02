package Java8Practice.Arrays;

public class OneDiminsonalArray {

	public static void main(String[] args) {
		
		int [] ab; //declartion
		int ab3[];//one more form of declartion
		
		
		int [] ab1 = {'1', '2', '3'}; // fast intilization 
		int  ab4[] = {'1', '2', '3'}; // fast intilization
		
		ab = new int[10]; // slow intilization each index wise assign the value
		ab3 = new int[5];// slow intilization each index wise assign the value
		
		System.out.println(ab[5]); // after intiling all index haviong defalut value 0
		
		int [] ab2 = new int[]{'1', '2', '3'}; //ab2[0] giving 49 value instead of 1 becuse we strore string 1 one int array 
		int ab5[] = new int[] {1,2,3};
		
		System.out.println(ab2[0]+""+ab2[1]+""+ab2[2]+""+ab5[2]);
		
		// reteriving the the array
		
		for(int i =0; i<ab2.length; i++) {
			System.out.println(ab2[i]);
		}
		
		reverse(ab2);
		reverseArray(ab2, 0, ab2.length-1);
		toFindMinValue(ab2);
		appendingZerosLast();
		resizeArray(8);
		checkStringPalindrome("madam");

	}

	private static void checkStringPalindrome(String word) {
		char[] array = word.toCharArray();
		int end= array.length-1;
		int start = 0;
		while(start < end) {
			if(array[start] != array[end]) {
				System.out.println("false");
			}
			start++;
			end--;
		}
		System.out.println("string is palindrome");
		
	}

	private static void toFindMinValue(int[] ab2) {
		int min = ab2[0];
		for(int i=1;i<ab2.length;i++) {
			if(ab2[i] < min) {
				min = ab2[i];
			}
		}
		System.out.println(min);
	}

	private static void reverse(int[] ab2) {
		System.out.println("reversing array");
		for(int i=ab2.length-1;i>-1;i--) {
			System.out.println(ab2[i]);
		}
		
	}
	
	private static void reverseArray(int[] ab2, int start, int end) {
		System.out.println("reversing array");
		while(start < end) {
			int temp = ab2[start];
			ab2[start] = ab2[end];
			ab2[end] = temp;
			start++;
			end--;
		}
	}
	
	private static void appendingZerosLast() {
		int [] ab5 = new int[]{1,2,0,3,0,4};
		int j=0;
		for(int i =0;i<ab5.length;i++) {
			if(ab5[i]!=0 && ab5[j] ==0) {
				int temp = ab5[i];
				ab5[i] = ab5[j];
				ab5[j] = temp;
			}
			if(ab5[j]!=0) {
				j++;
			}
		}
		
		for(int i =0; i<ab5.length; i++) {
			System.out.println(ab5[i]);
		}
		
	}
	
	
	private static void resizeArray(int capacity) {
		int [] array = new int[] {1,2,3,4};
		int [] temp = new int[capacity];
		for(int i = 0; i<array.length;i++) {
			temp[i] = array[i];
		}
		array = temp;
		System.out.println(array.length);
	}

}
