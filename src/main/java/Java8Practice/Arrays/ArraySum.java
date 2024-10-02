package Java8Practice.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {1,3,2,5};
		int sum = 7;
		
		for(int i =0;i<array.length;i++) {
			for(int j=1;j<array.length-1;j++) {
				int su = array[i]+array[j];
				if(sum == su) {
					System.out.println(array[i] + " " + array[j]);
				}
			}
		}

	

	}

}
