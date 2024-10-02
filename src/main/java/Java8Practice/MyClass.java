package Java8Practice;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 0, 1, 2, 2, 1, 0 };

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				int temp = a[i];
				 a[i] = a[i + 1];
				a[i+1] = temp;
				i = -1;
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

	}

}
