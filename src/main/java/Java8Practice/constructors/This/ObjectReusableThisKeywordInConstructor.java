package Java8Practice.constructors.This;

public class ObjectReusableThisKeywordInConstructor {
	String name;
	public ObjectReusableThisKeywordInConstructor(String name) {
		this.name = name;
		ObjectReusableThisKeywordinConstructor1 ks = new ObjectReusableThisKeywordinConstructor1(this);
	}
}
