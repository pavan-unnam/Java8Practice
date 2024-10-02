package Java8Practice.design.patterns.structural.decorator;

public class ChineseFood extends FoodDecorator{

	ChineseFood(Food food) {
		super(food);
	}
	
	public String prepareFood(){  
        return super.prepareFood() +" With Noodels  ";   
    }  
    public double foodPrice()   {  
        return super.goodPrice()+150.0;  
    }  

}
