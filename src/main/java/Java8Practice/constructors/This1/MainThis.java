package Java8Practice.constructors.This1;

import Java8Practice.constructors.This.DefaultCOnstructWIthPublic;
import Java8Practice.constructors.This.ObjectReusableThisKeyword;
import Java8Practice.constructors.This.ObjectReusableThisKeywordInConstructor;

public class MainThis {

	public static void main(String[] args) {
		ObjectReusableThisKeyword k = new ObjectReusableThisKeyword("p1");
		k.toPerform();
		
		ObjectReusableThisKeywordInConstructor tc = new ObjectReusableThisKeywordInConstructor("p3");
		//default constructor  and public constructor and using diffrent package to Object creation
		DefaultCOnstructWIthPublic dd = new DefaultCOnstructWIthPublic();
		DefaultCOnstructWIthPublic dd1 = new DefaultCOnstructWIthPublic("pavan");

	}
}
