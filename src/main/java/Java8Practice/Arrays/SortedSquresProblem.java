package Java8Practice.Arrays;

public class SortedSquresProblem {

	public static void main(String[] args) {
		int [] numbers = new int[] {-4,-1,0,10, 21};
		int n = numbers.length;
		int i = 0;
		int j = n-1;
		int result[] = new int[n];
		for(int k = n-1; k>=0; k--) {
			if(Math.abs(numbers[i]) > Math.abs(numbers[j])) {
				result[k] = numbers[i]*numbers[i];
				i++;
			} else {
				result[k] = numbers[j]*numbers[j];
				j--;
			}
			System.out.println(result[k]);
		}
	}

}
