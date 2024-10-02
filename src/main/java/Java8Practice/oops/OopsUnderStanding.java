package Java8Practice.oops;



import Java8Practice.oops1.B1;
import Java8Practice.oops1.F2;

public class OopsUnderStanding {

	public static void main(String[] args) {
		A a = new A();
		a.toCreateObjectForClassB(); //private not accessable outside the class
	}

}


class A {
	
	private void toCreateObjectForClassB () {
		// public class object
		B b = new B();
		
		//public variables accessible
		System.out.println(b.name);
		System.out.println(b.ACCESS);//static variable should be call with class name
		System.out.println(b.number);//static variable should be call with class name
		System.out.println(b.naumber1);
		
		//private variables not accessible the out side class
		System.out.println(b.nam1);
		System.out.println(b.ACCESS1);//static variable should be call with class name
		System.out.println(b.name2);//static variable should be call with class name
		System.out.println(b.surName);
		
		//default variables accessible
		System.out.println(b.lastName);
		System.out.println(b.name3);//static variable should be call with class name
		System.out.println(b.name4);//static variable should be call with class name
		System.out.println(b.name5);
		
		//protected variables accessible
		System.out.println(b.name9);
		System.out.println(b.name6);//static variable should be call with class name
		System.out.println(b.name7);//static variable should be call with class name
		System.out.println(b.name8);
		
		//public methods accessible
		b.toPrintName();
		b.toGetData();//static variable should be call with class name
		b.toGetNa();//static variable should be call with class name
		b.data();
		
		//private methods not accessible the out side class
		b.toGetName();
		b.toGetCall();//static variable should be call with class name
		b.toGetPa();//static variable should be call with class name
		b.dum();
		
		//default methods accessible
		b.toFetchName();
		b.toGet();//static variable should be call with class name
		b.toGetLa();//static variable should be call with class name
		b.toRamt();
		
		//protected methods accessible
		b.showName();
		b.toGetDetails();//static variable should be call with class name
		b.toGetMa();//static variable should be call with class name
		b.nut();
		
		// default class object with in same package
		C c  = new C();
		
		//public variables accessible
		System.out.println(c.name);
		System.out.println(c.ACCESS);//static variable should be call with class name
		System.out.println(c.number);//static variable should be call with class name
		System.out.println(c.naumber1);
		
		//private variables not accessible the out side class
		System.out.println(c.nam1);
		System.out.println(c.ACCESS1);//static variable should be call with class name
		System.out.println(c.name2);//static variable should be call with class name
		System.out.println(c.surName);
		
		//default variables accessible
		System.out.println(c.lastName);
		System.out.println(c.name3);//static variable should be call with class name
		System.out.println(c.name4);//static variable should be call with class name
		System.out.println(c.name5);
		
		//protected variables accessible
		System.out.println(c.name9);
		System.out.println(c.name6);//static variable should be call with class name
		System.out.println(c.name7);//static variable should be call with class name
		System.out.println(c.name8);
		
		//public methods accessible
		c.toPrintName();
		c.toGetData();//static variable should be call with class name
		c.toGetNa();//static variable should be call with class name
		c.data();
		
		//private methods not accessible the out side class
		c.toGetName();
		c.toGetCall();//static variable should be call with class name
		c.toGetPa();//static variable should be call with class name
		c.dum();
		
		//default methods accessible
		c.toFetchName();
		c.toGet();//static variable should be call with class name
		c.toGetLa();//static variable should be call with class name
		c.toRamt();
		
		//protected methods accessible
		c.showName();
		c.toGetDetails();//static variable should be call with class name
		c.toGetMa();//static variable should be call with class name
		c.nut();
		
		// final class object for same package
		F f = new F();
		
		//public variables accessible
				System.out.println(f.name);
				System.out.println(f.ACCESS);//static variable should be call with class name
				System.out.println(f.number);//static variable should be call with class name
				System.out.println(f.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(f.nam1);
				System.out.println(f.ACCESS1);//static variable should be call with class name
				System.out.println(f.name2);//static variable should be call with class name
				System.out.println(f.surName);
				
				//default variables accessible
				System.out.println(f.lastName);
				System.out.println(f.name3);//static variable should be call with class name
				System.out.println(f.name4);//static variable should be call with class name
				System.out.println(f.name5);
				
				//protected variables accessible
				System.out.println(f.name9);
				System.out.println(f.name6);//static variable should be call with class name
				System.out.println(f.name7);//static variable should be call with class name
				System.out.println(f.name8);
				
				//public methods accessible
				f.toPrintName();
				f.toGetData();//static variable should be call with class name
				f.toGetNa();//static variable should be call with class name
				f.data();
				
				//private methods not accessible the out side class
				f.toGetName();
				f.toGetCall();//static variable should be call with class name
				f.toGetPa();//static variable should be call with class name
				f.dum();
				
				//default methods accessible
				f.toFetchName();
				f.toGet();//static variable should be call with class name
				f.toGetLa();//static variable should be call with class name
				f.toRamt();
				
				//protected methods accessible
				f.showName();
				f.toGetDetails();//static variable should be call with class name
				f.toGetMa();//static variable should be call with class name
				f.nut();
		
	}
	
	private void toCreateObjectForClassB1 () {
		B1 b1 = new B1();
		//public variables accessible
				System.out.println(b1.name);
				System.out.println(b1.ACCESS);//static variable should be call with class name
				System.out.println(b1.number);//static variable should be call with class name
				System.out.println(b1.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(b1.nam1);
				System.out.println(b1.ACCESS1);//static variable should be call with class name
				System.out.println(b1.name2);//static variable should be call with class name
				System.out.println(b1.surName);
				
				//default variables accessible both class packages are different
				System.out.println(b1.lastName);
				System.out.println(b1.name3);//static variable should be call with class name
				System.out.println(b1.name4);//static variable should be call with class name
				System.out.println(b1.name5);
				
				//protected variables accessible both class packages are different
				System.out.println(b1.name9);
				System.out.println(b1.name6);//static variable should be call with class name
				System.out.println(b1.name7);//static variable should be call with class name
				System.out.println(b1.name8);
				
				//public methods accessible
				b1.toPrintName();
				b1.toGetData();//static variable should be call with class name
				b1.toGetNa();//static variable should be call with class name
				b1.data();
				
				//private methods not accessible the out side class
				b1.toGetName();
				b1.toGetCall();//static variable should be call with class name
				b1.toGetPa();//static variable should be call with class name
				b1.dum();
				
				//default methods not accessible both class packages are different
				b1.toFetchName();
				b1.toGet();//static variable should be call with class name
				b1.toGetLa();//static variable should be call with class name
				b1.toRamt();
				
				//protected methods not accessible both class packages are different
				b1.showName();
				b1.toGetDetails();//static variable should be call with class name
				b1.toGetMa();//static variable should be call with class name
				b1.nut();
				
				// default class object out side the package
				C1 c1 = new C1();
				
				// final class object for diffrenet  package
				F1 f = new F1();
				
				
				//public variables accessible
						System.out.println(f.name);
						System.out.println(f.ACCESS);//static variable should be call with class name
						System.out.println(f.number);//static variable should be call with class name
						System.out.println(f.naumber1);
						
						//private variables not accessible the out side class
						System.out.println(f.nam1);
						System.out.println(f.ACCESS1);//static variable should be call with class name
						System.out.println(f.name2);//static variable should be call with class name
						System.out.println(f.surName);
						
						//default variables accessible
						System.out.println(f.lastName);
						System.out.println(f.name3);//static variable should be call with class name
						System.out.println(f.name4);//static variable should be call with class name
						System.out.println(f.name5);
						
						//protected variables accessible
						System.out.println(f.name9);
						System.out.println(f.name6);//static variable should be call with class name
						System.out.println(f.name7);//static variable should be call with class name
						System.out.println(f.name8);
						
						//public methods accessible
						f.toPrintName();
						f.toGetData();//static variable should be call with class name
						f.toGetNa();//static variable should be call with class name
						f.data();
						
						//private methods not accessible the out side class
						f.toGetName();
						f.toGetCall();//static variable should be call with class name
						f.toGetPa();//static variable should be call with class name
						f.dum();
						
						//default methods accessible
						f.toFetchName();
						f.toGet();//static variable should be call with class name
						f.toGetLa();//static variable should be call with class name
						f.toRamt();
						
						//protected methods accessible
						f.showName();
						f.toGetDetails();//static variable should be call with class name
						f.toGetMa();//static variable should be call with class name
						f.nut();
						
						F2 f2 = new F2();
						
						//public variables accessible
						System.out.println(f2.name);
						System.out.println(f2.ACCESS);//static variable should be call with class name
						System.out.println(f2.number);//static variable should be call with class name
						System.out.println(f2.naumber1);
						
						//private variables not accessible the out side class
						System.out.println(f2.nam1);
						System.out.println(f2.ACCESS1);//static variable should be call with class name
						System.out.println(f2.name2);//static variable should be call with class name
						System.out.println(f2.surName);
						
						//default variables accessible
						System.out.println(f2.lastName);
						System.out.println(f2.name3);//static variable should be call with class name
						System.out.println(f2.name4);//static variable should be call with class name
						System.out.println(f2.name5);
						
						//protected variables accessible
						System.out.println(f2.name9);
						System.out.println(f2.name6);//static variable should be call with class name
						System.out.println(f2.name7);//static variable should be call with class name
						System.out.println(f2.name8);
						
						//public methods accessible
						f2.toPrintName();
						f2.toGetData();//static variable should be call with class name
						f2.toGetNa();//static variable should be call with class name
						f2.data();
						
						//private methods not accessible the out side class
						f2.toGetName();
						f2.toGetCall();//static variable should be call with class name
						f2.toGetPa();//static variable should be call with class name
						f2.dum();
						
						//default methods accessible
						f2.toFetchName();
						f2.toGet();//static variable should be call with class name
						f2.toGetLa();//static variable should be call with class name
						f2.toRamt();
						
						//protected methods accessible
						f2.showName();
						f2.toGetDetails();//static variable should be call with class name
						f2.toGetMa();//static variable should be call with class name
						f2.nut();
	}
	
}
