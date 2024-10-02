package Java8Practice.excpetion.handling;

import java.io.IOException;

public class TestExceptionChild  extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//check excpetion can't throw if parent method doesnt declare the exception But can add runtime exceptions
	@Override
	void msg() throws IOException {    
	    System.out.println("TestExceptionChild");    
	  }  

}

class Parent{   
	  
	  // defining the method   
	  void msg() {  
	    System.out.println("parent method");  
	    }
}
