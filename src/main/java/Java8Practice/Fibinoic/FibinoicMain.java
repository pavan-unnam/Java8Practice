package Java8Practice.Fibinoic;

public class FibinoicMain {

	public static void main(String[] args) {
		// itreation method
		IterationFibinoic.toPrintFini(10);
		
		// recursive method
		System.out.println("recursive");
		int n=10;
		for(int i=0; i<n;i++) {
			System.out.print(RecursiveFibinoic.fib(i)+ " ");
		}
		
		//memorization technic of Dynamic Programming
		// similarly like recursive only diffrence is memorization
		System.out.println("memorization");
		int n1=10;
		MemoriazationOrTopDownFibinoic mf = new MemoriazationOrTopDownFibinoic();
		for(int i=0; i<n1;i++) {
			System.out.print(mf.fib(i)+ " ");
		}
		
		//tabulaization or bottom to top approach
		System.out.println("tabulaization");
		int n2=10;
		TabulationOrBottomToTopFibinoc.fib(n2);
	}
}
