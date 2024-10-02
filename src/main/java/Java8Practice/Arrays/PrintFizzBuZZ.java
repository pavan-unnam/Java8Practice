package Java8Practice.Arrays;

public class PrintFizzBuZZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =3;
		int b = 5;
		for(int i =1; i<=65;i++) {
		    if(i==a && i == b) {
		    	a = a+3;
		    	b = b+5;
		        System.out.println("FizzBuzz");
		    } else if(i ==a) {
		    	a = a+3;
		        System.out.println("Fizz");
		    } else if(i ==b) {
		    	b = b+5;
		        System.out.println("Buzz");
		    } else {
		        System.out.println(i); 
		    }
		}
	}

}
