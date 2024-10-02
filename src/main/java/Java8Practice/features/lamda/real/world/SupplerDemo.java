package Java8Practice.features.lamda.real.world;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
//public class SupplerDemo implements Supplier<String>{
public class SupplerDemo {

	/*
	 * @Override public String get() { return "Hi kumar get the job by next month";
	 * }
	 */
	
	public void getData() {
		Supplier<String> s = ()->"hi kumkar get the job by next month";
		System.out.println(s.get());
	}
	
	public void getListData() {
	List<String>list = Arrays.asList();
	System.out.println(list.stream().findAny().orElseGet(()->"not found anything"));
	}

}
