package Java8Practice.abstarct;

import Java8Practice.abstarct1.AbstartctSub3;

public class AbstartMain {

	public static void main(String[] args) {
		toCreateObject();
		toCreatObjectDefaultClass();
		ToCreateObjectOtherPackage();
	}

	private static void ToCreateObjectOtherPackage() {
		AbstractExample ex = new AbstractExample();
		AbstractExample ex1 = new AbstartctSub3();
		AbstartctSub3 ex2 = new AbstartctSub3();
		
		ex1.demo3();
		ex1.demo5();
		ex1.demo7();
		
		ex2.demo3();
		ex2.demo5();
		ex2.demo7();
		
		//public variables accessible
				System.out.println(ex1.name);
				System.out.println(ex1.ACCESS);//static variable should be call with class name
				System.out.println(ex1.number);//static variable should be call with class name
				System.out.println(ex1.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(ex1.nam1);
				System.out.println(ex1.ACCESS1);//static variable should be call with class name
				System.out.println(ex1.name2);//static variable should be call with class name
				System.out.println(ex1.surName);
				
				//default variables accessible
				System.out.println(ex1.lastName);
				System.out.println(ex1.name3);//static variable should be call with class name
				System.out.println(ex1.name4);//static variable should be call with class name
				System.out.println(ex1.name5);
				
				//protected variables accessible
				System.out.println(ex1.name9);
				System.out.println(ex1.name6);//static variable should be call with class name
				System.out.println(ex1.name7);//static variable should be call with class name
				System.out.println(ex1.name8);
				
				//public methods accessible
				ex1.toPrintName();
				ex1.toGetData();//static variable should be call with class name
				ex1.toGetNa();//static variable should be call with class name
				ex1.data();
				
				//private methods not accessible the out side class
				ex1.toGetName();
				ex1.toGetCall();//static variable should be call with class name
				ex1.toGetPa();//static variable should be call with class name
				ex1.dum();
				
				//default methods accessible
				ex1.toFetchName();
				ex1.toGet();//static variable should be call with class name
				ex1.toGetLa();//static variable should be call with class name
				ex1.toRamt();
				
				//protected methods accessible
				ex1.showName();
				ex1.toGetDetails();//static variable should be call with class name
				ex1.toGetMa();//static variable should be call with class name
				ex1.nut();
				
				//public variables accessible
				System.out.println(ex2.name);
				System.out.println(ex2.ACCESS);//static variable should be call with class name
				System.out.println(ex2.number);//static variable should be call with class name
				System.out.println(ex2.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(ex2.nam1);
				System.out.println(ex2.ACCESS1);//static variable should be call with class name
				System.out.println(ex2.name2);//static variable should be call with class name
				System.out.println(ex2.surName);
				
				//default variables accessible
				System.out.println(ex2.lastName);
				System.out.println(ex2.name3);//static variable should be call with class name
				System.out.println(ex2.name4);//static variable should be call with class name
				System.out.println(ex2.name5);
				
				//protected variables accessible
				System.out.println(ex2.name9);
				System.out.println(ex2.name6);//static variable should be call with class name
				System.out.println(ex2.name7);//static variable should be call with class name
				System.out.println(ex2.name8);
				
				//public methods accessible
				ex2.toPrintName();
				ex2.toGetData();//static variable should be call with class name
				ex2.toGetNa();//static variable should be call with class name
				ex2.data();
				
				//private methods not accessible the out side class
				ex2.toGetName();
				ex2.toGetCall();//static variable should be call with class name
				ex2.toGetPa();//static variable should be call with class name
				ex2.dum();
				
				//default methods accessible
				ex2.toFetchName();
				ex2.toGet();//static variable should be call with class name
				ex2.toGetLa();//static variable should be call with class name
				ex2.toRamt();
				
				//protected methods accessible
				ex2.showName();
				ex2.toGetDetails();//static variable should be call with class name
				ex2.toGetMa();//static variable should be call with class name
				ex2.nut();
		
	}

	private static void toCreatObjectDefaultClass() {
		AbsractDemo dm = new AbsractDemo(); //can't create directly object for abstract class
		AbsractDemo dm1 = new AbstarctSub1();
		AbstarctSub1 dm2 = new AbstarctSub1();
		
		dm1.demo3();
		dm1.demo5();
		dm1.demo7();
		
		dm2.demo3();
		dm2.demo5();
		dm2.demo7();
		
		//public variables accessible
		System.out.println(dm1.name);
		System.out.println(dm1.ACCESS);//static variable should be call with class name
		System.out.println(dm1.number);//static variable should be call with class name
		System.out.println(dm1.naumber1);
		
		//private variables not accessible the out side class
		System.out.println(dm1.nam1);
		System.out.println(dm1.ACCESS1);//static variable should be call with class name
		System.out.println(dm1.name2);//static variable should be call with class name
		System.out.println(dm1.surName);
		
		//default variables accessible
		System.out.println(dm1.lastName);
		System.out.println(dm1.name3);//static variable should be call with class name
		System.out.println(dm1.name4);//static variable should be call with class name
		System.out.println(dm1.name5);
		
		//protected variables accessible
		System.out.println(dm1.name9);
		System.out.println(dm1.name6);//static variable should be call with class name
		System.out.println(dm1.name7);//static variable should be call with class name
		System.out.println(dm1.name8);
		
		//public methods accessible
		dm1.toPrintName();
		dm1.toGetData();//static variable should be call with class name
		dm1.toGetNa();//static variable should be call with class name
		dm1.data();
		
		//private methods not accessible the out side class
		dm1.toGetName();
		dm1.toGetCall();//static variable should be call with class name
		dm1.toGetPa();//static variable should be call with class name
		dm1.dum();
		
		//default methods accessible
		dm1.toFetchName();
		dm1.toGet();//static variable should be call with class name
		dm1.toGetLa();//static variable should be call with class name
		dm1.toRamt();
		
		//protected methods accessible
		dm1.showName();
		dm1.toGetDetails();//static variable should be call with class name
		dm1.toGetMa();//static variable should be call with class name
		dm1.nut();
		
		
		//public variables accessible
				System.out.println(dm2.name);
				System.out.println(dm2.ACCESS);//static variable should be call with class name
				System.out.println(dm2.number);//static variable should be call with class name
				System.out.println(dm2.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(dm2.nam1);
				System.out.println(dm2.ACCESS1);//static variable should be call with class name
				System.out.println(dm2.name2);//static variable should be call with class name
				System.out.println(dm2.surName);
				
				//default variables accessible
				System.out.println(dm2.lastName);
				System.out.println(dm2.name3);//static variable should be call with class name
				System.out.println(dm2.name4);//static variable should be call with class name
				System.out.println(dm2.name5);
				
				//protected variables accessible
				System.out.println(dm2.name9);
				System.out.println(dm2.name6);//static variable should be call with class name
				System.out.println(dm2.name7);//static variable should be call with class name
				System.out.println(dm2.name8);
				
				//public methods accessible
				dm2.toPrintName();
				dm2.toGetData();//static variable should be call with class name
				dm2.toGetNa();//static variable should be call with class name
				dm2.data();
				
				//private methods not accessible the out side class
				dm2.toGetName();
				dm2.toGetCall();//static variable should be call with class name
				dm2.toGetPa();//static variable should be call with class name
				dm2.dum();
				
				//default methods accessible
				dm2.toFetchName();
				dm2.toGet();//static variable should be call with class name
				dm2.toGetLa();//static variable should be call with class name
				dm2.toRamt();
				
				//protected methods accessible
				dm2.showName();
				dm2.toGetDetails();//static variable should be call with class name
				dm2.toGetMa();//static variable should be call with class name
				dm2.nut();
		
	}

	private static void toCreateObject() {
		AbstractExample ex = new AbstractExample();
		AbstractExample ex1 = new AbstractSub();
		AbstractSub ex2 = new AbstractSub();
		
		ex1.demo3();
		ex1.demo5();
		ex1.demo7();
		
		ex2.demo3();
		ex2.demo5();
		ex2.demo7();
		
		//public variables accessible
				System.out.println(ex1.name);
				System.out.println(ex1.ACCESS);//static variable should be call with class name
				System.out.println(ex1.number);//static variable should be call with class name
				System.out.println(ex1.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(ex1.nam1);
				System.out.println(ex1.ACCESS1);//static variable should be call with class name
				System.out.println(ex1.name2);//static variable should be call with class name
				System.out.println(ex1.surName);
				
				//default variables accessible
				System.out.println(ex1.lastName);
				System.out.println(ex1.name3);//static variable should be call with class name
				System.out.println(ex1.name4);//static variable should be call with class name
				System.out.println(ex1.name5);
				
				//protected variables accessible
				System.out.println(ex1.name9);
				System.out.println(ex1.name6);//static variable should be call with class name
				System.out.println(ex1.name7);//static variable should be call with class name
				System.out.println(ex1.name8);
				
				//public methods accessible
				ex1.toPrintName();
				ex1.toGetData();//static variable should be call with class name
				ex1.toGetNa();//static variable should be call with class name
				ex1.data();
				
				//private methods not accessible the out side class
				ex1.toGetName();
				ex1.toGetCall();//static variable should be call with class name
				ex1.toGetPa();//static variable should be call with class name
				ex1.dum();
				
				//default methods accessible
				ex1.toFetchName();
				ex1.toGet();//static variable should be call with class name
				ex1.toGetLa();//static variable should be call with class name
				ex1.toRamt();
				
				//protected methods accessible
				ex1.showName();
				ex1.toGetDetails();//static variable should be call with class name
				ex1.toGetMa();//static variable should be call with class name
				ex1.nut();
				
				//public variables accessible
				System.out.println(ex2.name);
				System.out.println(ex2.ACCESS);//static variable should be call with class name
				System.out.println(ex2.number);//static variable should be call with class name
				System.out.println(ex2.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(ex2.nam1);
				System.out.println(ex2.ACCESS1);//static variable should be call with class name
				System.out.println(ex2.name2);//static variable should be call with class name
				System.out.println(ex2.surName);
				
				//default variables accessible
				System.out.println(ex2.lastName);
				System.out.println(ex2.name3);//static variable should be call with class name
				System.out.println(ex2.name4);//static variable should be call with class name
				System.out.println(ex2.name5);
				
				//protected variables accessible
				System.out.println(ex2.name9);
				System.out.println(ex2.name6);//static variable should be call with class name
				System.out.println(ex2.name7);//static variable should be call with class name
				System.out.println(ex2.name8);
				
				//public methods accessible
				ex2.toPrintName();
				ex2.toGetData();//static variable should be call with class name
				ex2.toGetNa();//static variable should be call with class name
				ex2.data();
				
				//private methods not accessible the out side class
				ex2.toGetName();
				ex2.toGetCall();//static variable should be call with class name
				ex2.toGetPa();//static variable should be call with class name
				ex2.dum();
				
				//default methods accessible
				ex2.toFetchName();
				ex2.toGet();//static variable should be call with class name
				ex2.toGetLa();//static variable should be call with class name
				ex2.toRamt();
				
				//protected methods accessible
				ex2.showName();
				ex2.toGetDetails();//static variable should be call with class name
				ex2.toGetMa();//static variable should be call with class name
				ex2.nut();
	}

}
