package Java8Practice.Fibinoic;

public class IterationFibinoic {
	//similarly to tabulatization process or bottom to top
	//only diffrenece is not storing
	public static void toPrintFini(int n) {
		int n0 = 0;
		int n1 = 1;
		int n3;
		
		for(int i = 0; i<n; i++) {
			System.out.print(n0 + " " );
			n3 = n0+n1;
			//swap
			n0 = n1;
			n1 = n3;
		}
		
	}

}
