package Java8Practice.excpetion.handling;

public class ExceptionHandling {

	public static void main(String[] args) {
		ExceptionHandling eh = new ExceptionHandling();
		 // printing the hashcode   
        System.out.println("Hashcode is: " + eh.hashCode());           
        eh = null;    
        // calling the garbage collector using gc()   
        System.gc();     
        System.out.println("End of the garbage collection");  

	}
	
	protected void finalize() {
		System.out.println("called the finlize method");
	}

}
