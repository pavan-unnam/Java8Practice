package Java8Practice.features.lamda.stream.map.vs.flatmap;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::print);
		end = System.currentTimeMillis();
		System.out.println("Plain STream took time : " +(end-start));
		
		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::print);
		end = System.currentTimeMillis();
		System.out.println("Plain STream took time : " +(end-start));

	}

}
