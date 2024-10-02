package Java8Practice.polymorphysium;

public class PolymorphisumMain {
	
	//

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.sum("pavam");
		mo.sum(10, 10);
		mo.sum(10, 10, 10);
		mo.sum(10, "pavan");
		mo.sum("pavan", 10);
		mo.sub(10, 5);// executed int of parameters instead of lomng
		
		// we can't do method overloading at retrun type level it gives ambiguity problem
		
		//compileTime polymorphisum and static binding
		//If there is any private, final or static method in a class, there is static binding.
		CompileTimePolymorphisum cp = new CompileTimePolymorphisum();
		CompileTimePolymorphisum.sum(20, 20);
		CompileTimePolymorphisum.sum(20, 20,20);
		
		//runtime polymorphisum and dynamic binding
		Bank a = new SBIBank();//upcasting or widening  or Generalization
		a.getRates();
		Bank b = new HDFCBank();//upcasting or widening  or Generalization
		b.getRates();
		//parent class object reference is porintbf child object that is called upcasting
		
		
		//downcasting if child class object reference 
		
		
		SBIBank sbi = new Bank(); // it will compile error
		
		SBIBank sbi1 = (SBIBank) new Bank();// it will compile runtime will through the exception
		
		// downcasting or narrowing or specilaization
		Bank b1 = new SBIBank();
		SBIBank sbi2 = (SBIBank) b1;
		
		Bank a1 = new SBIBank();
		SBIBank.method(a1);
		
		//downcasting with ineterface or narrowing or specalization
		Printable p=new B();  
		Call c=new Call();  
		c.invoke(p); 
		
	}
}
