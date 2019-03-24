package day10;

import java.util.Scanner;

public class AmazonTry {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter the price!");
			double price = scan.nextDouble();
			
			System.out.println("Prime member!");
			boolean isPrimeMember = scan.nextBoolean();
			
			
			if(isPrimeMember) {
				System.out.println("You got free shipping! ");
			}
			
			else if (price>35) {
				System.out.println("You still got free shipping! ");
			}
			
			else {
				System.out.println(" You gotta pay 5$" + price);
				System.out.println("you may consider joining prime to "+ "avoid free shipping");
			}
	}

}
