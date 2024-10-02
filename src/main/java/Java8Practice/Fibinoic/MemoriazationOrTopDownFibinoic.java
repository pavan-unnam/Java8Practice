package Java8Practice.Fibinoic;

public class MemoriazationOrTopDownFibinoic {
	
	 final int MAX = 100;

	 int lookup[] = new int[MAX];
	 
	 int fib(int n)
	  {
	    if (lookup[n] == 0)
	    {
	      if (n <= 1)
	          lookup[n] = n;
	      else
	          lookup[n] = fib(n-1) + fib(n-2);
	    }
	    return lookup[n];
	  }
}
