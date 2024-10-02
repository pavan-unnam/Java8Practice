package Java8Practice.design.patterns.creational.factory;

import java.util.Scanner;

public class FactoryTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("calculation need");
		
		CalculateFactory factory = new CalculateFactory();
		Calculate obj = factory.toGetCalcualte(sc.next());
		obj.toCalculate(num1, num2);
	}

}
