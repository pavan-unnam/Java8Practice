package Java8Practice.Algorithoms.Sort;


public class MergeSort {

	public static void main(String[] args) {
		int[] array = new int[] {5,10,56,57};
		int[] array1 = new int[] {13,52,89,76,90};
		int[] result = SortingASC(array, array.length, array1, array1.length);
		toPrint(result);
		
		int [] number = new int[] {2,1,5,9,10,21,11,7};
		int[] temp = new int [number.length];
		mergeSort(number, temp, 0, number.length-1);

	}
	
	// spliting unsorted array sorting and merging to single array
	private static void mergeSort(int[] number, int[] temp, int low, int high) {
		if(low<high) {
			int mid = low+(high-low)/2;
			mergeSort(number, temp, low, mid);
			mergeSort(number, temp, mid+1, high);
			merge(number, temp, low, mid,high);
		}
		
	}


	private static void merge(int[] number, int[] temp, int low, int mid, int high) {
		for(int i = low;i<=high; i++) {
			temp[i] = number[i];
		}
		
		int i = low, j = mid+1, k = low;
		
		while(i<=mid && j<=high) {
			if(temp[i] < number[j]) {
				number[k]=temp[i];
				i++;
			} else {
				number[k]=temp[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) {
			number[k]=temp[i];
			i++;k++;
		}
		System.out.println("array sort");
		toPrint(number);
	}

	//Merging two sorted arrays in ascending order
	private static int[] SortingASC(int[] array, int length, int[] array1, int length2) {
		int[] result = new int[length+length2];
		int i = 0 ,j = 0 ,k = 0;
		while(i<length && j<length2) {
			if(array[i] < array1[j]) {
				result[k]=array[i];
				i++;
			} else {
				result[k]=array1[j];
				j++;
			}
			k++;
		}
		
		while(i<length) {
			result[k]=array[i];
			i++;k++;
		}
		
		while(j<length2) {
			result[k]=array1[j];
			j++;k++;
		}
		return result;
	}
	
	public static void toPrint(int[] array) {
		for(int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
