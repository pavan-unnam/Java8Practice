package Java8Practice.design.patterns.structural.decorator;

public class FoodDecorator implements Food {
	
	Food food;
	
	FoodDecorator(Food food) {
		this.food = food;
	}

	@Override
	public String prepareFood() {
		return food.prepareFood();   
	}

	@Override
	public double goodPrice() {
		return food.goodPrice();  
	}

}
