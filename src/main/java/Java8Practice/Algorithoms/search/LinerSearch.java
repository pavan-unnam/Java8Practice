package Java8Practice.Algorithoms.search;
//sequential serach
public class LinerSearch {

	public static void main(String[] args) {
		int[] array = new int[] {1,10,11,56,45,57};
		serachArrayLiner(array, array.length, 56);

	}

	private static void serachArrayLiner(int[] array, int length, int val) {
		
		for(int i = 0; i<length;i++) {
			if(array[i]==val) {
				System.out.println(i);
			}
		}
		
	}

}
