package Java8Practice.design.patterns.behavior.strategy;

public class Addition implements Strategy {

	  @Override  
	    public float calculation(float a, float b) {  
	        return a+b;  
	    }  
}
