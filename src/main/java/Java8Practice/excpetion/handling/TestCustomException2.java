package Java8Practice.excpetion.handling;

public class TestCustomException2 {
	
	 // method to check the age  
    static void validate (int age){    
       if(age < 18){  
  
        // throw an object of user defined exception  
        throw new AgeNotGoodException("age should be greater than 18");   
    } else {   
        System.out.println("welcome to vote");   
        }   
     }    

}
