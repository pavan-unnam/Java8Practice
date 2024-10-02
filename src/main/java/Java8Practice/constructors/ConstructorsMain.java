package Java8Practice.constructors;

import Java8Practice.constructors1.DefaultCOnstructor1;
import Java8Practice.constructors1.ProtectedCOnstructor1;
import Java8Practice.constructors1.PublicConstructor1;

public class ConstructorsMain {

	public static void main(String[] args) {
		
		//DegaultCOnstructorAndParameterCOnstructor
		DegaultCOnstructorAndParameterCOnstructor np = new DegaultCOnstructorAndParameterCOnstructor();
		
		//if class having both noarg and param constructor we cna create object both ways
		//if have class having only paramter cisntructor but trying to cretae object with default construictor means compiler genration
		//it will give compilor error
		
	// all methods to cretae noargconstructor creation we have use below methods logic
		toCreateObjectForPrivateCOnstarcut();
		toCreateObjectForPublicCOnstructor();
		toCreateObjectForDefaultCOnstructor();
		toCreateObjectFOrProtectedCOnstructor();
		
		// toCretaeObject With ArgeParamater constructor
		
		toCreateObjectForPrivateArgCOnstarcut();
		toCreateObjectForPublicArgCOnstructor();
		toCreateObjectForDefaultArgCOnstructor();
		toCreateObjectFOrProtectedArgCOnstructor();
		
	}

	private static void toCreateObjectFOrProtectedArgCOnstructor() {
		//same package
				ProtectedCOnstructor pc = new ProtectedCOnstructor("pavan");
				DefaultProtectedCOnstructor dc = new DefaultProtectedCOnstructor("pavan");
				
				// diff package
				ProtectedCOnstructor1 pc1 = new ProtectedCOnstructor1("pavan");
				DefaultProtectedCOnstructor1 dc1 = new DefaultProtectedCOnstructor1("pavan");
		
	}

	private static void toCreateObjectForDefaultArgCOnstructor() {
		//same package
				DefaultCOnstructor dp = new DefaultCOnstructor("pavan");
				DefaultDConstructor ddp = new DefaultDConstructor("pavan");
				// diff package
				DefaultCOnstructor1 dp1 = new DefaultCOnstructor1("pavan");
				DefaultDConstructor1 ddp1 = new DefaultDConstructor1("pavan");
		
	}

	private static void toCreateObjectForPublicArgCOnstructor() {
		//same package
				PublicConstructor pc = new PublicConstructor("pavan");
				DefaultPublicCOnstrutor dp = new DefaultPublicCOnstrutor("pavan");
				// diff packafge
				PublicConstructor1 pc1 = new PublicConstructor1("pavan");
				DefaultPublicCOnstrutor1 dp1 = new DefaultPublicCOnstrutor1("pavan");
		
	}

	private static void toCreateObjectForPrivateArgCOnstarcut() {
		// same package
				NoargConstructExample ns = new NoargConstructExample("pavan");
				NoargConstructExample1 ns1 = new NoargConstructExample1("pavan");
		
	}

	private static void toCreateObjectFOrProtectedCOnstructor() {
		//same package
		ProtectedCOnstructor pc = new ProtectedCOnstructor();
		DefaultProtectedCOnstructor dc = new DefaultProtectedCOnstructor();
		// diff package
		ProtectedCOnstructor1 pc1 = new ProtectedCOnstructor1();
		DefaultProtectedCOnstructor1 dc1 = new DefaultProtectedCOnstructor1();
	}

	private static void toCreateObjectForDefaultCOnstructor() {
		//same package
		DefaultCOnstructor dp = new DefaultCOnstructor();
		DefaultDConstructor ddp = new DefaultDConstructor();
		// diff package
		DefaultCOnstructor1 dp1 = new DefaultCOnstructor1();
		DefaultDConstructor1 ddp1 = new DefaultDConstructor1();
	}

	private static void toCreateObjectForPublicCOnstructor() {
		//same package
		PublicConstructor pc = new PublicConstructor();
		DefaultPublicCOnstrutor dp = new DefaultPublicCOnstrutor();
		// diff packafge
		PublicConstructor1 pc1 = new PublicConstructor1();
		DefaultPublicCOnstrutor1 dp1 = new DefaultPublicCOnstrutor1();
	}

	private static void toCreateObjectForPrivateCOnstarcut() {
		// same package
		NoargConstructExample ns = new NoargConstructExample();
		NoargConstructExample1 ns1 = new NoargConstructExample1();
		
		// diffrener package not required
	}

}
