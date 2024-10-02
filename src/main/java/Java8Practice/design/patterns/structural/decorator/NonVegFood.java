package Java8Practice.design.patterns.structural.decorator;

public class NonVegFood extends FoodDecorator {

	NonVegFood(Food food) {
		super(food);
	}
	
	public String prepareFood(){  
        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";   
    }  
    public double foodPrice()   {  
        return super.goodPrice()+150.0;  
    }  

}
