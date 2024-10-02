package Java8Practice.constructors.This;

public class ObjectReusableThisKeywordinConstructor1 {
	ObjectReusableThisKeywordInConstructor obj;
	ObjectReusableThisKeywordinConstructor1(ObjectReusableThisKeywordInConstructor obj) {
		this.obj = obj;
		System.out.println(obj.name);
	}
}
