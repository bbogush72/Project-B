package day11;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		int itemPrice;
		int quarters = 25;
		int dimes = 10;
		int nickels = 5;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter price in cents:");

		itemPrice = in.nextInt();

		if (itemPrice == 100) {
			System.out.println("Your change is "+"0 quarters, "+"0 dimes, and" +" 0 nickels ");
		}
		else if(itemPrice ==95) {
			System.out.println("Your change is "+"0 quarters, "+"0 dimes, and" +" 1 nickels.");
		}
		else if(itemPrice==90) {
			System.out.println("Your change is "+"0 quarters, "+"1 dimes, and" +" 0 nickels ");
		}
		
		else if(itemPrice==55) {
			System.out.println("Your change is "+"1 quarters, "+"2 dimes, and" +" 0 nickels.");
		}
		else if(itemPrice==85) {
			System.out.println("Your change is "+"0 quarters, "+"1 dimes, and" +" 1 nickels.");
		}
		else if(itemPrice%5==0 || itemPrice ==54) {
			System.out.println("Invalid price!");
		}
		else if(itemPrice>100) {
			System.out.println("Invalid price!");
		}
	}

}
