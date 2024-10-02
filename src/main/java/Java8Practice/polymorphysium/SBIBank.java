package Java8Practice.polymorphysium;

public class SBIBank extends Bank {

	@Override
	void getRates() {
		System.out.println("SBI " +14);
	}
	
	 static void method(Bank a) {  
		    if(a instanceof SBIBank){  
		    	SBIBank d=(SBIBank)a;//downcasting  
		       System.out.println("ok downcasting performed");  
		    }  
	 }
}
