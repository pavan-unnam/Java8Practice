package Java8Practice.Algorithoms.Sort;

//Ascending order
public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {5,1,11,10,56,45,57};
		array = SortingASC(array, array.length);
		toPrint(array);
	}

	private static int[] SortingASC(int[] array, int length) {
		boolean swap;
		for(int i =0; i<length-1;i++) {
			swap = false;
			for(int j=0; j<length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swap = true;
				}
			}
			if(!swap) {
				System.out.println(swap);
				break;
			}
		}
		return array;
	}
	
	public static void toPrint(int[] array) {
		for(int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
