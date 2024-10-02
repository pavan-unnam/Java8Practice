package Java8Practice.Arrays;

public class SpriralFormMatrix {

	public static void main(String[] args) {
		int [][] matrix =new int[][] {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int row = matrix.length;
		int column =  matrix.length;
		SprialPrint(matrix, row, column);
	}

	private static void SprialPrint(int[][] matrix, int row, int column) {
		int i,r=0,c=0;
		while(r<row && c<column) {
			for(i=c;i<column;i++) {
				System.out.println(matrix[r][i]+" ");
			}
			r++;
			for(i=r;i<row;i++) {
				System.out.println(matrix[i][column-1]+" ");
			}
			column--;
			if(r<row) {
				for(i=column-1;i>=c;i--) {
					System.out.println(matrix[row-1][i]+" ");
				}
				row--;
			}
			
			if(c<column) {
				for(i=row-1;i>=r;i--) {
					System.out.println(matrix[i][c]+" ");
				}
				c++;
			}
		}
		
	}

}
