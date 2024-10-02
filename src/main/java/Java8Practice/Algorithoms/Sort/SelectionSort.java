package Java8Practice.Algorithoms.Sort;
//Ascending order
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = new int[] {5,1,11,10,56,45,57};
		array = SortingASC(array, array.length);
		toPrint(array);
	}
	
	private static int[] SortingASC(int[] array, int length) {
		for(int i = 0; i < length-1 ; i++) {
			int min = i;
			for(int j = i+1;j<length;j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return array;
	}
	
	public static void toPrint(int[] array) {
		for(int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
