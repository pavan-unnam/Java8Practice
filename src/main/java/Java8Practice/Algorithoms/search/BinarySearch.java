package Java8Practice.Algorithoms.search;

// divide and conquer 
public class BinarySearch {

	public static void main(String[] args) {
		//array should be sorted
		int[] array = new int[] {1,10,11,45,56,57};
		System.out.println(serachArrayBinary(array, 56));

	}

	private static int serachArrayBinary(int[] array, int val) {
		int low = 0;
		int high = array.length -1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(array[mid]==val) {
			return mid;
			}
			
			if(val < array[mid]) {
				high = mid-1;
			} else {
				low=mid+1;
			}
		}
		return -1;
		
	}

}
