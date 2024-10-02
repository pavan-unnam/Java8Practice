package Java8Practice.interface1;

import Java8Practice.interface2.DiifrentPackgeImplementsInterface2;

public class InterFaceMain {

	public static void main(String[] args) {
		toCreateObjectforDefaultOneSamePacakge();
		toCreateObjectforPublicSamePacakge();
		toCreateObjectForTwoInrefacesClass();
		toCreateObjectOutSidePackageClass();
		
	}

	private static void toCreateObjectOutSidePackageClass() {
		DiifrentPackgeImplementsInterface2 ico = new DiifrentPackgeImplementsInterface2();
		Interface2 ic = new DiifrentPackgeImplementsInterface2();
		
		ico.demo3();
		ico.demo5();
		ico.demo7();
		ico.demo6();
		ico.demo8();
		ico.demo4();

		//public variables accessible
				System.out.println(ico.name);
				System.out.println(ico.ACCESS);//static variable should be call with class name
				System.out.println(ico.number);//static variable should be call with class name
				System.out.println(ico.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(ico.nam1);
				System.out.println(ico.ACCESS1);//static variable should be call with class name
				System.out.println(ico.name2);//static variable should be call with class name
				System.out.println(ico.surName);
				
				//default variables accessible
				System.out.println(ico.lastName);
				System.out.println(ico.name3);//static variable should be call with class name
				System.out.println(ico.name4);//static variable should be call with class name
				System.out.println(ico.name5);
				
				//protected variables accessible
				System.out.println(ico.name9);
				System.out.println(ico.name6);//static variable should be call with class name
				System.out.println(ico.name7);//static variable should be call with class name
				System.out.println(ico.name8);
				
				//public methods accessible
				ico.toPrintName();
				ico.toGetData();//static variable should be call with interface name 
				ico.toGetNa();//static variable should be call with interface name
				ico.data();
				
				//private methods not accessible the out side class or interface
				ico.toGetName();
				ico.toGetCall();//static variable should be call with interface name its is invalid
				ico.toGetPa();//static variable should be call with interface name ts is invalid
				ico.dum();
				
				//default methods accessible
				ico.toFetchName();
				ico.toGet();//static variable should be call with interface name
				ico.toGetLa();//static variable should be call with interface name
				ico.toRamt();
				
				//protected methods accessible but it is not valid check interface for clarity
				ico.showName();
				ico.toGetDetails();//static variable should be call with interface name
				ico.toGetMa();//static variable should be call with interface name
				ico.nut();
				
				ic.demo3();
				ic.demo5();
				ic.demo7();
				ic.demo6();
				ic.demo8();
				ic.demo4();

				//public variables accessible
						System.out.println(ic.name);
						System.out.println(ic.ACCESS);//static variable should be call with class name
						System.out.println(ic.number);//static variable should be call with class name
						System.out.println(ic.naumber1);
						
						//private variables not accessible the out side class
						System.out.println(ic.nam1);
						System.out.println(ic.ACCESS1);//static variable should be call with class name
						System.out.println(ic.name2);//static variable should be call with class name
						System.out.println(ic.surName);
						
						//default variables accessible
						System.out.println(ic.lastName);
						System.out.println(ic.name3);//static variable should be call with class name
						System.out.println(ic.name4);//static variable should be call with class name
						System.out.println(ic.name5);
						
						//protected variables accessible
						System.out.println(ic.name9);
						System.out.println(ic.name6);//static variable should be call with class name
						System.out.println(ic.name7);//static variable should be call with class name
						System.out.println(ic.name8);
						
						//public methods accessible
						ic.toPrintName();
						ic.toGetData();//static variable should be call with interface name 
						ic.toGetNa();//static variable should be call with interface name
						ic.data();
						
						//private methods not accessible the out side class or interface
						ic.toGetName();
						ic.toGetCall();//static variable should be call with interface name its is invalid
						ic.toGetPa();//static variable should be call with interface name ts is invalid
						ic.dum();
						
						//default methods accessible
						ic.toFetchName();
						ic.toGet();//static variable should be call with interface name
						ic.toGetLa();//static variable should be call with interface name
						ic.toRamt();
						
						//protected methods accessible but it is not valid check interface for clarity
						ic.showName();
						ic.toGetDetails();//static variable should be call with interface name
						ic.toGetMa();//static variable should be call with interface name
						ic.nut();
		
	}

	private static void toCreateObjectForTwoInrefacesClass() {
		InterFaceExampleWithClass3 ico = new InterFaceExampleWithClass3();
		Interface2 ic = new InterFaceExampleWithClass3();
		InterFace1 ic1 = new InterFaceExampleWithClass3();
		
		ico.demo3();
		ico.demo5();
		ico.demo7();
		ico.demo6();
		ico.demo8();
		ico.demo4();

		//public variables accessible
				System.out.println(ico.name);
				System.out.println(ico.ACCESS);//static variable should be call with class name
				System.out.println(ico.number);//static variable should be call with class name
				System.out.println(ico.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(ico.nam1);
				System.out.println(ico.ACCESS1);//static variable should be call with class name
				System.out.println(ico.name2);//static variable should be call with class name
				System.out.println(ico.surName);
				
				//default variables accessible
				System.out.println(ico.lastName);
				System.out.println(ico.name3);//static variable should be call with class name
				System.out.println(ico.name4);//static variable should be call with class name
				System.out.println(ico.name5);
				
				//protected variables accessible
				System.out.println(ico.name9);
				System.out.println(ico.name6);//static variable should be call with class name
				System.out.println(ico.name7);//static variable should be call with class name
				System.out.println(ico.name8);
				
				//public methods accessible
				ico.toPrintName();
				ico.toGetData();//static variable should be call with interface name 
				ico.toGetNa();//static variable should be call with interface name
				ico.data();
				
				//private methods not accessible the out side class or interface
				ico.toGetName();
				ico.toGetCall();//static variable should be call with interface name its is invalid
				ico.toGetPa();//static variable should be call with interface name ts is invalid
				ico.dum();
				
				//default methods accessible
				ico.toFetchName();
				ico.toGet();//static variable should be call with interface name
				ico.toGetLa();//static variable should be call with interface name
				ico.toRamt();
				
				//protected methods accessible but it is not valid check interface for clarity
				ico.showName();
				ico.toGetDetails();//static variable should be call with interface name
				ico.toGetMa();//static variable should be call with interface name
				ico.nut();
				
				ic.demo3();
				ic.demo5();
				ic.demo7();
				ic.demo6();
				ic.demo8();
				ic.demo4();

				//public variables accessible
						System.out.println(ic.name);
						System.out.println(ic.ACCESS);//static variable should be call with class name
						System.out.println(ic.number);//static variable should be call with class name
						System.out.println(ic.naumber1);
						
						//private variables not accessible the out side class
						System.out.println(ic.nam1);
						System.out.println(ic.ACCESS1);//static variable should be call with class name
						System.out.println(ic.name2);//static variable should be call with class name
						System.out.println(ic.surName);
						
						//default variables accessible
						System.out.println(ic.lastName);
						System.out.println(ic.name3);//static variable should be call with class name
						System.out.println(ic.name4);//static variable should be call with class name
						System.out.println(ic.name5);
						
						//protected variables accessible
						System.out.println(ic.name9);
						System.out.println(ic.name6);//static variable should be call with class name
						System.out.println(ic.name7);//static variable should be call with class name
						System.out.println(ic.name8);
						
						//public methods accessible
						ic.toPrintName();
						ic.toGetData();//static variable should be call with interface name 
						ic.toGetNa();//static variable should be call with interface name
						ic.data();
						
						//private methods not accessible the out side class or interface
						ic.toGetName();
						ic.toGetCall();//static variable should be call with interface name its is invalid
						ic.toGetPa();//static variable should be call with interface name ts is invalid
						ic.dum();
						
						//default methods accessible
						ic.toFetchName();
						ic.toGet();//static variable should be call with interface name
						ic.toGetLa();//static variable should be call with interface name
						ic.toRamt();
						
						//protected methods accessible but it is not valid check interface for clarity
						ic.showName();
						ic.toGetDetails();//static variable should be call with interface name
						ic.toGetMa();//static variable should be call with interface name
						ic.nut();
						
						ic1.demo3();
						ic1.demo5();
						ic1.demo7();
						ic1.demo6();
						ic1.demo8();
						ic1.demo4();

						//public variables accessible
								System.out.println(ic1.name);
								System.out.println(ic1.ACCESS);//static variable should be call with class name
								System.out.println(ic1.number);//static variable should be call with class name
								System.out.println(ic1.naumber1);
								
								//private variables not accessible the out side class
								System.out.println(ic1.nam1);
								System.out.println(ic1.ACCESS1);//static variable should be call with class name
								System.out.println(ic1.name2);//static variable should be call with class name
								System.out.println(ic1.surName);
								
								//default variables accessible
								System.out.println(ic1.lastName);
								System.out.println(ic1.name3);//static variable should be call with class name
								System.out.println(ic1.name4);//static variable should be call with class name
								System.out.println(ic1.name5);
								
								//protected variables accessible
								System.out.println(ic1.name9);
								System.out.println(ic1.name6);//static variable should be call with class name
								System.out.println(ic1.name7);//static variable should be call with class name
								System.out.println(ic1.name8);
								
								//public methods accessible
								ic1.toPrintName();
								ic1.toGetData();//static variable should be call with interface name 
								ic1.toGetNa();//static variable should be call with interface name
								ic1.data();
								
								//private methods not accessible the out side class or interface
								ic1.toGetName();
								ic1.toGetCall();//static variable should be call with interface name its is invalid
								ic1.toGetPa();//static variable should be call with interface name ts is invalid
								ic1.dum();
								
								//default methods accessible
								ic1.toFetchName();
								ic1.toGet();//static variable should be call with interface name
								ic1.toGetLa();//static variable should be call with interface name
								ic1.toRamt();
								
								//protected methods accessible but it is not valid check interface for clarity
								ic1.showName();
								ic1.toGetDetails();//static variable should be call with interface name
								ic1.toGetMa();//static variable should be call with interface name
								ic1.nut();
	}

	private static void toCreateObjectforPublicSamePacakge() {
		InterFaceExampleWithClass ico = new InterFaceExampleWithClass();
		InterFace1 ic = new InterFaceExampleWithClass();
		
		ico.demo3();
		ico.demo5();
		ico.demo7();
		ico.demo6();
		ico.demo8();
		ico.demo4();

		//public variables accessible
				System.out.println(ico.name);
				System.out.println(ico.ACCESS);//static variable should be call with class name
				System.out.println(ico.number);//static variable should be call with class name
				System.out.println(ico.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(ico.nam1);
				System.out.println(ico.ACCESS1);//static variable should be call with class name
				System.out.println(ico.name2);//static variable should be call with class name
				System.out.println(ico.surName);
				
				//default variables accessible
				System.out.println(ico.lastName);
				System.out.println(ico.name3);//static variable should be call with class name
				System.out.println(ico.name4);//static variable should be call with class name
				System.out.println(ico.name5);
				
				//protected variables accessible
				System.out.println(ico.name9);
				System.out.println(ico.name6);//static variable should be call with class name
				System.out.println(ico.name7);//static variable should be call with class name
				System.out.println(ico.name8);
				
				//public methods accessible
				ico.toPrintName();
				ico.toGetData();//static variable should be call with interface name 
				ico.toGetNa();//static variable should be call with interface name
				ico.data();
				
				//private methods not accessible the out side class or interface
				ico.toGetName();
				ico.toGetCall();//static variable should be call with interface name its is invalid
				ico.toGetPa();//static variable should be call with interface name ts is invalid
				ico.dum();
				
				//default methods accessible
				ico.toFetchName();
				ico.toGet();//static variable should be call with interface name
				ico.toGetLa();//static variable should be call with interface name
				ico.toRamt();
				
				//protected methods accessible but it is not valid check interface for clarity
				ico.showName();
				ico.toGetDetails();//static variable should be call with interface name
				ico.toGetMa();//static variable should be call with interface name
				ico.nut();
				
				ic.demo3();
				ic.demo5();
				ic.demo7();
				ic.demo6();
				ic.demo8();
				ic.demo4();

				//public variables accessible
						System.out.println(ic.name);
						System.out.println(ic.ACCESS);//static variable should be call with class name
						System.out.println(ic.number);//static variable should be call with class name
						System.out.println(ic.naumber1);
						
						//private variables not accessible the out side class
						System.out.println(ic.nam1);
						System.out.println(ic.ACCESS1);//static variable should be call with class name
						System.out.println(ic.name2);//static variable should be call with class name
						System.out.println(ic.surName);
						
						//default variables accessible
						System.out.println(ic.lastName);
						System.out.println(ic.name3);//static variable should be call with class name
						System.out.println(ic.name4);//static variable should be call with class name
						System.out.println(ic.name5);
						
						//protected variables accessible
						System.out.println(ic.name9);
						System.out.println(ic.name6);//static variable should be call with class name
						System.out.println(ic.name7);//static variable should be call with class name
						System.out.println(ic.name8);
						
						//public methods accessible
						ic.toPrintName();
						ic.toGetData();//static variable should be call with interface name 
						ic.toGetNa();//static variable should be call with interface name
						ic.data();
						
						//private methods not accessible the out side class or interface
						ic.toGetName();
						ic.toGetCall();//static variable should be call with interface name its is invalid
						ic.toGetPa();//static variable should be call with interface name ts is invalid
						ic.dum();
						
						//default methods accessible
						ic.toFetchName();
						ic.toGet();//static variable should be call with interface name
						ic.toGetLa();//static variable should be call with interface name
						ic.toRamt();
						
						//protected methods accessible but it is not valid check interface for clarity
						ic.showName();
						ic.toGetDetails();//static variable should be call with interface name
						ic.toGetMa();//static variable should be call with interface name
						ic.nut();
	}

	private static void toCreateObjectforDefaultOneSamePacakge() {
		
		InterFaceExampleWithCalss2 ico = new InterFaceExampleWithCalss2();
		Interface2 ic = new InterFaceExampleWithCalss2();
		
		ico.demo3();
		ico.demo5();
		ico.demo7();
		ico.demo6();
		ico.demo8();
		ico.demo4();

		//public variables accessible
				System.out.println(ico.name);
				System.out.println(ico.ACCESS);//static variable should be call with class name
				System.out.println(ico.number);//static variable should be call with class name
				System.out.println(ico.naumber1);
				
				//private variables not accessible the out side class
				System.out.println(ico.nam1);
				System.out.println(ico.ACCESS1);//static variable should be call with class name
				System.out.println(ico.name2);//static variable should be call with class name
				System.out.println(ico.surName);
				
				//default variables accessible
				System.out.println(ico.lastName);
				System.out.println(ico.name3);//static variable should be call with class name
				System.out.println(ico.name4);//static variable should be call with class name
				System.out.println(ico.name5);
				
				//protected variables accessible
				System.out.println(ico.name9);
				System.out.println(ico.name6);//static variable should be call with class name
				System.out.println(ico.name7);//static variable should be call with class name
				System.out.println(ico.name8);
				
				//public methods accessible
				ico.toPrintName();
				ico.toGetData();//static variable should be call with interface name 
				ico.toGetNa();//static variable should be call with interface name
				ico.data();
				
				//private methods not accessible the out side class or interface
				ico.toGetName();
				ico.toGetCall();//static variable should be call with interface name its is invalid
				ico.toGetPa();//static variable should be call with interface name ts is invalid
				ico.dum();
				
				//default methods accessible
				ico.toFetchName();
				ico.toGet();//static variable should be call with interface name
				ico.toGetLa();//static variable should be call with interface name
				ico.toRamt();
				
				//protected methods accessible but it is not valid check interface for clarity
				ico.showName();
				ico.toGetDetails();//static variable should be call with interface name
				ico.toGetMa();//static variable should be call with interface name
				ico.nut();
				
				ic.demo3();
				ic.demo5();
				ic.demo7();
				ic.demo6();
				ic.demo8();
				ic.demo4();

				//public variables accessible
						System.out.println(ic.name);
						System.out.println(ic.ACCESS);//static variable should be call with class name
						System.out.println(ic.number);//static variable should be call with class name
						System.out.println(ic.naumber1);
						
						//private variables not accessible the out side class
						System.out.println(ic.nam1);
						System.out.println(ic.ACCESS1);//static variable should be call with class name
						System.out.println(ic.name2);//static variable should be call with class name
						System.out.println(ic.surName);
						
						//default variables accessible
						System.out.println(ic.lastName);
						System.out.println(ic.name3);//static variable should be call with class name
						System.out.println(ic.name4);//static variable should be call with class name
						System.out.println(ic.name5);
						
						//protected variables accessible
						System.out.println(ic.name9);
						System.out.println(ic.name6);//static variable should be call with class name
						System.out.println(ic.name7);//static variable should be call with class name
						System.out.println(ic.name8);
						
						//public methods accessible
						ic.toPrintName();
						ic.toGetData();//static variable should be call with interface name 
						ic.toGetNa();//static variable should be call with interface name
						ic.data();
						
						//private methods not accessible the out side class or interface
						ic.toGetName();
						ic.toGetCall();//static variable should be call with interface name its is invalid
						ic.toGetPa();//static variable should be call with interface name ts is invalid
						ic.dum();
						
						//default methods accessible
						ic.toFetchName();
						ic.toGet();//static variable should be call with interface name
						ic.toGetLa();//static variable should be call with interface name
						ic.toRamt();
						
						//protected methods accessible but it is not valid check interface for clarity
						ic.showName();
						ic.toGetDetails();//static variable should be call with interface name
						ic.toGetMa();//static variable should be call with interface name
						ic.nut();
	}

}
