package Java8Practice.Fibinoic;

public class RecursiveFibinoic {
	
	static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }

}
