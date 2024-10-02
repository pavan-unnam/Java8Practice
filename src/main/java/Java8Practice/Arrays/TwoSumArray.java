package Java8Practice.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// sum the index if matches target value return the index
public class TwoSumArray {

	public static void main(String[] args) {
		int [] numbers = new int[] {2,1,5,10,7,22};
		int target = 9;
		//approach 1 with hashmap
		sumThetwoIndex(numbers, target);
		//approach2
		int result[] = sumThetwoIndex1(numbers, target);
		System.out.println(result[0] + " " + result[1]);

	}

	private static int[] sumThetwoIndex1(int[] numbers, int target) {
		int [] result = new int[2];
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length -1;
		while(left < right) {
			int sum = numbers[left]+numbers[right];
			if(sum==target) {
				result[0]=numbers[left];
				result[1]=numbers[right];
				return result;
			} else if(sum < target) {
				left++;
			} else {
				right--;
			}
			
		}
		return result;
	}

	private static void sumThetwoIndex(int[] numbers, int target) {
		
		int [] result = new int[2];
		Map map = new HashMap();
		for(int i = 0; i<numbers.length; i++) {
			if(!map.containsKey(target-numbers[i])) {
				map.put(numbers[i], i);
			} else {
				result[1] = i;
				result[0] = (int) map.get(target-numbers[i]);
			}
		}
		System.out.println(result[0] + " "+result[1]);
	}

}
