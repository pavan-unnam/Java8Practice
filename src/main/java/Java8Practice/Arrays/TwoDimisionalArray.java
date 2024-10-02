package Java8Practice.Arrays;

public class TwoDimisionalArray {

	public static void main(String[] args) {
		int [][] ab; //declartion
		int ab3[][];//one more form of declartion
		
		int [][] ab1 = {{'1', '2'}, {'3','4'}}; // fast intilization 
		int  ab4[][] = {{'1', '2'}, {'3','4'}}; // fast intilization
		
		ab = new int[10][10]; // slow intilization each index wise assign the value
		ab3 = new int[5][10];// slow intilization each index wise assign the value
		
		System.out.println(ab[5][1]); // after intiling all index haviong defalut value 0
		System.out.println(ab[5]); // printing object of array
		
		int [][] ab2 = new int[][]{{'1', '2'}, {'3','4'}}; //ab2[0] giving 49 value instead of 1 becuse we strore string 1 one int array 
		int ab5[][] = new int[][] {{1, 2}, {3,4}};
		
		System.out.println(ab2[0][1]+""+ab2[1][0]+""+ab5[0][1]);
		System.out.println("length of 2d-array" + ab2.length);
		
		// reteriving the the array
				for(int i =0; i<ab2.length; i++) {
					for(int j=0; j<ab2[i].length;j++) {
					System.out.println(ab2[i][j]);
					}
				}

				findTheKeyInMatrix(2, ab5);
	}

	private static void findTheKeyInMatrix(int key, int[][] ab5) {
		int i =0;
		int j = ab5.length-1;
		while(i<ab5.length && j>=0) {
			if(ab5[i][j]==key) {
				System.out.println("index : "+i+" "+j);
			}
			
			if(ab5[i][j] > key) {
				j--;
			} else {
				i++;
			}
		}
	}
	
	

}
