package Java8Practice.features.lamda.real.world;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


//public class ConsumerDemo implements Consumer<Integer> {
public class ConsumerDemo {

	/*
	 * @Override public void accept(Integer t) { System.out.println("printing " +
	 * t); }
	 */
	
	public void GetAccept() {
		Consumer<Integer> consume = (t1)->System.out.println("Printing : " + t1);
		consume.accept(10);
	}
	
	public void GetAcceptWithList() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().forEach((t1)->System.out.println("Printing : " + t1));
		
	}

}
