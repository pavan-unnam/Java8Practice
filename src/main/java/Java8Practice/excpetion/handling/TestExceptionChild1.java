package Java8Practice.excpetion.handling;


//if exception declared at parent methoverriden child we can use same exception, sub exception or no exceptions but not parent exception
	public class TestExceptionChild1 extends Parent1 {
   
		  void msg()throws RuntimeException {  
		    System.out.println("child method");  
		  }    
		    
		  public static void main(String args[]) {      
		     
		  
		  }    
		}     

class Parent1{    
	  void msg()throws Exception {  
	    System.out.println("parent method");  
	  }    
	}   