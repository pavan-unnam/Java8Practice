package Java8Practice.Arrays;

//finding the missing number in distinct natual numbers in gievn array
// first find the range and sum it with formula and substract the each element
public class FindingMissingNumber {

	public static void main(String[] args) {
		int numbers [] = new int[] {2,1,3,4,8,7,6};
		int n = numbers.length+1;
		int sum = n*(n+1)/2;
		for(int num : numbers) {
			sum = sum - num;
		}
		System.out.println("missing number is : " + sum);
	}

}
