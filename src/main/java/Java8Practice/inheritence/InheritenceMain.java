package Java8Practice.inheritence;

import Java8Practice.inheritence1.SubClassB13;
import Java8Practice.inheritence1.SubClassB2;

public class InheritenceMain {

	public static void main(String[] args) {
		toObjectCreateB();
		toObjectCreateC();
		toObjectCreateB2();
	}

	private static void toObjectCreateB2() {
		
		SubClassB2 b2 = new SubClassB2();
		//public variables accessible
				System.out.println(b2.name);
				System.out.println(b2.ACCESS);//static variable should be call with class name
				System.out.println(b2.number);//static variable should be call with class name
				System.out.println(b2.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(b2.nam1);
				System.out.println(b2.ACCESS1);//static variable should be call with class name
				System.out.println(b2.name2);//static variable should be call with class name
				System.out.println(b2.surName);
				
				//default variables accessible
				System.out.println(b2.lastName);
				System.out.println(b2.name3);//static variable should be call with class name
				System.out.println(b2.name4);//static variable should be call with class name
				System.out.println(b2.name5);
				
				//protected variables accessible
				System.out.println(b2.name9);
				System.out.println(b2.name6);//static variable should be call with class name
				System.out.println(b2.name7);//static variable should be call with class name
				System.out.println(b2.name8);
				
				//public methods accessible
				b2.toPrintName();
				b2.toGetData();//static variable should be call with class name
				b2.toGetNa();//static variable should be call with class name
				b2.data();
				
				//private methods not accessible the out side class
				b2.toGetName();
				b2.toGetCall();//static variable should be call with class name
				b2.toGetPa();//static variable should be call with class name
				b2.dum();
				
				//default methods accessible
				b2.toFetchName();
				b2.toGet();//static variable should be call with class name
				b2.toGetLa();//static variable should be call with class name
				b2.toRamt();
				
				//protected methods accessible
				b2.showName();
				b2.toGetDetails();//static variable should be call with class name
				b2.toGetMa();//static variable should be call with class name
				b2.nut();
				
				
				SubClassB13 b13 = new SubClassB13();
				
				//public variables accessible
						System.out.println(b13.name);
						System.out.println(b13.ACCESS);//static variable should be call with class name
						System.out.println(b13.number);//static variable should be call with class name
						System.out.println(b13.naumber1);
						
						//private variables not accessible the out side class
						System.out.println(b13.nam1);
						System.out.println(b13.ACCESS1);//static variable should be call with class name
						System.out.println(b2.name2);//static variable should be call with class name
						System.out.println(b2.surName);
						
						//default variables accessible
						System.out.println(b2.lastName);
						System.out.println(b2.name3);//static variable should be call with class name
						System.out.println(b13.name4);//static variable should be call with class name
						System.out.println(b13.name5);
						
						//protected variables accessible
						System.out.println(b13.name9);
						System.out.println(b13.name6);//static variable should be call with class name
						System.out.println(b13.name7);//static variable should be call with class name
						System.out.println(b13.name8);
						
						//public methods accessible
						b13.toPrintName();
						b13.toGetData();//static variable should be call with class name
						b13.toGetNa();//static variable should be call with class name
						b13.data();
						
						//private methods not accessible the out side class
						b13.toGetName();
						b13.toGetCall();//static variable should be call with class name
						b13.toGetPa();//static variable should be call with class name
						b13.dum();
						
						//default methods accessible
						b2.toFetchName();
						b2.toGet();//static variable should be call with class name
						b2.toGetLa();//static variable should be call with class name
						b2.toRamt();
						
						//protected methods accessible
						b13.showName();
						b13.toGetDetails();//static variable should be call with class name
						b13.toGetMa();//static variable should be call with class name
						b13.nut();
	}

	private static void toObjectCreateC() {
		SubClassC c = new SubClassC();
		
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
				
				SuperCLassC c1 = new SuperCLassC();
				
				//public variables accessible
				System.out.println(c1.name);
				System.out.println(c1.ACCESS);//static variable should be call with class name
				System.out.println(c1.number);//static variable should be call with class name
				System.out.println(c1.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(c1.nam1);
				System.out.println(c1.ACCESS1);//static variable should be call with class name
				System.out.println(c1.name2);//static variable should be call with class name
				System.out.println(c1.surName);
				
				//default variables accessible
				System.out.println(c1.lastName);
				System.out.println(c1.name3);//static variable should be call with class name
				System.out.println(c1.name4);//static variable should be call with class name
				System.out.println(c1.name5);
				
				//protected variables accessible
				System.out.println(c1.name9);
				System.out.println(c1.name6);//static variable should be call with class name
				System.out.println(c1.name7);//static variable should be call with class name
				System.out.println(c1.name8);
				
				//public methods accessible
				c1.toPrintName();
				c1.toGetData();//static variable should be call with class name
				c1.toGetNa();//static variable should be call with class name
				c1.data();
				
				//private methods not accessible the out side class
				c1.toGetName();
				c1.toGetCall();//static variable should be call with class name
				c1.toGetPa();//static variable should be call with class name
				c1.dum();
				
				//default methods accessible
				c1.toFetchName();
				c1.toGet();//static variable should be call with class name
				c1.toGetLa();//static variable should be call with class name
				c1.toRamt();
				
				//protected methods accessible
				c1.showName();
				c1.toGetDetails();//static variable should be call with class name
				c1.toGetMa();//static variable should be call with class name
				c1.nut();
				
				SubClassC12 c12 = new SubClassC12();
				
				//public variables accessible
				System.out.println(c12.name);
				System.out.println(c12.ACCESS);//static variable should be call with class name
				System.out.println(c12.number);//static variable should be call with class name
				System.out.println(c12.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(c12.nam1);
				System.out.println(c12.ACCESS1);//static variable should be call with class name
				System.out.println(c12.name2);//static variable should be call with class name
				System.out.println(c12.surName);
				
				//default variables accessible
				System.out.println(c12.lastName);
				System.out.println(c12.name3);//static variable should be call with class name
				System.out.println(c12.name4);//static variable should be call with class name
				System.out.println(c12.name5);
				
				//protected variables accessible
				System.out.println(c12.name9);
				System.out.println(c12.name6);//static variable should be call with class name
				System.out.println(c12.name7);//static variable should be call with class name
				System.out.println(c12.name8);
				
				//public methods accessible
				c12.toPrintName();
				c12.toGetData();//static variable should be call with class name
				c12.toGetNa();//static variable should be call with class name
				c12.data();
				
				//private methods not accessible the out side class
				c1.toGetName();
				c1.toGetCall();//static variable should be call with class name
				c1.toGetPa();//static variable should be call with class name
				c1.dum();
				
				//default methods accessible
				c12.toFetchName();
				c12.toGet();//static variable should be call with class name
				c12.toGetLa();//static variable should be call with class name
				c12.toRamt();
				
				//protected methods accessible
				c12.showName();
				c12.toGetDetails();//static variable should be call with class name
				c12.toGetMa();//static variable should be call with class name
				c12.nut();
	}

	private static void toObjectCreateB() {
		SubClassB b = new SubClassB();
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
		
		SuperClassB bs = new SuperClassB(); // directly super class object created
		
		//public variables accessible
		System.out.println(bs.name);
		System.out.println(bs.ACCESS);//static variable should be call with class name
		System.out.println(bs.number);//static variable should be call with class name
		System.out.println(bs.naumber1);
		
		//private variables not accessible the out side class
		System.out.println(bs.nam1);
		System.out.println(bs.ACCESS1);//static variable should be call with class name
		System.out.println(bs.name2);//static variable should be call with class name
		System.out.println(bs.surName);
		
		//default variables accessible
		System.out.println(bs.lastName);
		System.out.println(bs.name3);//static variable should be call with class name
		System.out.println(bs.name4);//static variable should be call with class name
		System.out.println(bs.name5);
		
		//protected variables accessible
		System.out.println(bs.name9);
		System.out.println(bs.name6);//static variable should be call with class name
		System.out.println(bs.name7);//static variable should be call with class name
		System.out.println(bs.name8);
		
		//public methods accessible
		bs.toPrintName();
		bs.toGetData();//static variable should be call with class name
		bs.toGetNa();//static variable should be call with class name
		bs.data();
		
		//private methods not accessible the out side class
		bs.toGetName();
		bs.toGetCall();//static variable should be call with class name
		bs.toGetPa();//static variable should be call with class name
		bs.dum();
		
		//default methods accessible
		bs.toFetchName();
		bs.toGet();//static variable should be call with class name
		bs.toGetLa();//static variable should be call with class name
		bs.toRamt();
		
		//protected methods accessible
		bs.showName();
		bs.toGetDetails();//static variable should be call with class name
		bs.toGetMa();//static variable should be call with class name
		bs.nut();
		
		SubClassB12 b12 = new SubClassB12(); // accessing super class methods and variables
		
		//public variables accessible
		System.out.println(b12.name);
		System.out.println(b12.ACCESS);//static variable should be call with class name
		System.out.println(b12.number);//static variable should be call with class name
		System.out.println(b12.naumber1);
		
		//private variables not accessible the out side class
		System.out.println(b12.nam1);
		System.out.println(b12.ACCESS1);//static variable should be call with class name
		System.out.println(b12.name2);//static variable should be call with class name
		System.out.println(b12.surName);
		
		//default variables accessible
		System.out.println(b12.lastName);
		System.out.println(b12.name3);//static variable should be call with class name
		System.out.println(b12.name4);//static variable should be call with class name
		System.out.println(b12.name5);
		
		//protected variables accessible
		System.out.println(b12.name9);
		System.out.println(b12.name6);//static variable should be call with class name
		System.out.println(b12.name7);//static variable should be call with class name
		System.out.println(b12.name8);
		
		//public methods accessible
		b12.toPrintName();
		b12.toGetData();//static variable should be call with class name
		b12.toGetNa();//static variable should be call with class name
		b12.data();
		
		//private methods not accessible the out side class
		b12.toGetName();
		b12.toGetCall();//static variable should be call with class name
		b12.toGetPa();//static variable should be call with class name
		b12.dum();
		
		//default methods accessible
		b12.toFetchName();
		b12.toGet();//static variable should be call with class name
		b12.toGetLa();//static variable should be call with class name
		b12.toRamt();
		
		//protected methods accessible
		b12.showName();
		b12.toGetDetails();//static variable should be call with class name
		b12.toGetMa();//static variable should be call with class name
		b12.nut();
	}

}
