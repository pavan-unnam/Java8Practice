package Java8Practice.design.patterns.structural.flyWieght;

import java.util.HashMap;

public class AnimalFactory {
	
	private static final HashMap<String, Animal> map = new HashMap<String, Animal>();
	public static Animal animal;
	
	public static Animal toGetCat(String name) {
		String key = name+"cat";
		animal = map.get(key);
		if(animal != null) {
			return animal;
		} else {
			animal = new Cat();
			animal.setName(name);
			map.put(key, animal);
		}
		return animal;
	}
	
	public static Animal toGetDog(String name) {
		String key = name+"dog";
		animal = map.get(key);
		if(animal != null) {
			return animal;
		} else {
			animal = new Dog();
			animal.setName(name);
			map.put(key, animal);
		}
		return animal;
	}
}
