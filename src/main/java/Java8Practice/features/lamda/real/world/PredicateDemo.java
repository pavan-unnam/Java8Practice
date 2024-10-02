package Java8Practice.features.lamda.real.world;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


//public class PredicateDemo implements Predicate<Integer>{
public class PredicateDemo {

	/*
	 * @Override public boolean test(Integer t) {
	 * 
	 * if(t%2==0) { return true; } return false; }
	 */
	
	public void checkCOndition() {
		Predicate<Integer> pred = t->{
			if(t%2==0) {
				return true;
			}
			return false;
		};
		System.out.println(pred.test(10));
	}
	
	public void checkConditionList() {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().filter(t1->t1%2==0).forEach(t->System.out.println("print :" + t));
		
	}

}
