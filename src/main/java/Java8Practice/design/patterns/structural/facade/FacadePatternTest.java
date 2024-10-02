package Java8Practice.design.patterns.structural.facade;

import java.util.Scanner;

public class FacadePatternTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		ShopKeeper sk = new ShopKeeper();
		switch(choice) {
		case 1: sk.iphoneSale();
		break;
		case 2 : sk.blackBerrySale();
		break;
		default : System.out.println("No choices");
		break;
		}

	}

}
