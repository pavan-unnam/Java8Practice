package Java8Practice.Arrays;

public class KadensAlogorithomForMaxSubArray {

	public static void main(String[] args) {
		
		int[] array = new int[] {1,8,-12,11,6,1};
		int maxSoFar = array[0];
		int currentMax = array[0];
		
		for(int i =1; i<array.length;i++) {
			currentMax = currentMax+array[i];
			if(currentMax < array[i]) {
				currentMax = array[i];
			}
			
			if(maxSoFar < currentMax) {
				maxSoFar = currentMax;
			}
		}
		
		System.out.println("max : "+  maxSoFar);

	}

}
