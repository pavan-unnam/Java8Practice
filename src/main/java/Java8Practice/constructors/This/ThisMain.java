package Java8Practice.constructors.This;

import Java8Practice.constructors.This1.ObjectReusableThisKeyword2;

public class ThisMain {

	public static void main(String[] args) {
		ThisKeywordWIthDifferGlobalAndLocal lc = new ThisKeywordWIthDifferGlobalAndLocal("pavan");
		lc.toPrintName();
		System.out.println(lc.name);
		ThisWIthMethodChain th = new ThisWIthMethodChain("pavan");
		th.toPrintName();
		ConstructorChaining ch = new ConstructorChaining(112,"sumit","java",6000f); 
		ch.display();
		//oBject reuse
		ObjectReusableThisKeyword k = new ObjectReusableThisKeyword("p1");
		k.toPerform();
		//oBject reuse diff package
		ObjectReusableThisKeyword2 k1 = new ObjectReusableThisKeyword2("p2");
		k1.toPerform();
		
		//Object reuse in constructor
		ObjectReusableThisKeywordInConstructor tc = new ObjectReusableThisKeywordInConstructor("p3");
		
		//returing current class obj
		ReturnCurrentObjWithThis tonj = new ReturnCurrentObjWithThis();
		tonj.getReturnCurrentObj().printOb();
	}

}
