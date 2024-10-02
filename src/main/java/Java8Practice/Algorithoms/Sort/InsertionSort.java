package Java8Practice.Algorithoms.Sort;
//Ascending order
//simplry card games in hand sorted but desk not sorted
public class InsertionSort {

	public static void main(String[] args) {
		int[] array = new int[] {5,1,11,10,56,45,57};
		array = SortingASC(array, array.length);
		toPrint(array);
	}
	
	private static int[] SortingASC(int[] array, int length) {
		for(int i = 1; i < length ; i++) {
			int temp = array[i];
			int j = i-1;
			while(j>=0 &&  array[j] > temp) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = temp;
		}
		return array;
	}
	
	public static void toPrint(int[] array) {
		for(int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
