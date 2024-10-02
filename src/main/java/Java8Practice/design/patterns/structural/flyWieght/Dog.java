package Java8Practice.design.patterns.structural.flyWieght;

public class Dog implements Animal {
	
	private String name;

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void printAttributes() {
		System.out.println("name of animal : "+name);
		System.out.println("attriburtes eyes"+CommonSharable.eyes);
		System.out.println("attriburtes eyes"+CommonSharable.legs);
	}

}
