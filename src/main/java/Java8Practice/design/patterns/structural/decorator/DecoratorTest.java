package Java8Practice.design.patterns.structural.decorator;

import java.util.Scanner;

public class DecoratorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			VegFood vf = new VegFood();
			System.out.println(vf.prepareFood());
			System.out.println(vf.goodPrice());
		}
			break;

		case 2: {
			Food f1 = new NonVegFood((Food) new VegFood());
			System.out.println(f1.prepareFood());
			System.out.println(f1.goodPrice());
		}
			break;
		case 3: {
			Food f2 = new ChineseFood((Food) new VegFood());
			System.out.println(f2.prepareFood());
			System.out.println(f2.goodPrice());
		}
			break;

		default: {
			System.out.println("Other than these no food available");
			break;
		}

		}
	}
}
