package Java8Practice.features.lamda.method.rererence;

import java.util.function.BiFunction;

public class MethodRefrenceExample {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Aithmetic::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
	
	
	static class Aithmetic  {
		public static int add(int a, int b) {
			return a+b;
		}
	}

}
