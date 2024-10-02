package Java8Practice.Arrays;

public class SubArrrayMid {

	public static void main(String[] args) {
		
		int array[] = new int[] {1,4,5,7,6};
		
		int low = 4;
		int high = 7;
		int j= 1;
		int start = 0;
		int end = 0;
		for(int i = 0; i<array.length-1;i++) {
			if(array[i]> array[j]) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
			
			if(array[i] == low) {
				start = i;
			} else if(array[i] == high && j!=array.length-1) {
				end = i;
			} else if(array[j] == high && j==array.length-1){
				end = j;
			}
			j++;
			
		}
		
		
		
		/*
		 * int [] subArray = new int[end+1];
		 * 
		 * System.out.println(start +" "+ end); for(int i = start;i<=end;i++) {
		 * subArray[i] = array[i]; System.out.println(subArray[i]); }
		 */
		int midVal = start+(end-start)/2;
		//System.out.println(subArray[midVal]);
		System.out.println(array[midVal]);

		for(int i = 0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
