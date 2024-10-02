package string.example;

public class TestSample {

	public static void main(String[] args) {
	
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int	notation = 1;
		
		arr =ToDO(arr, notation);
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] ToDO(int[] arr, int notation) {
		int j = 0;
		for (int i = 0; i < notation; i++) {
			if(i>=arr.length-1) {
				j=0;
			}
				int temp = arr[j + 1];
				arr[j + 1] = arr[j];
				arr[j] = temp;
				j++; 
			}
		return arr;

	}
	
	

}
