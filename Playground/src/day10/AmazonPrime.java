package day10;
import java.util.Scanner;
public class AmazonPrime {

	public static void main(String[] args) {
		String isPrimeMember;
		String isNotPrimeMember;
		double price;
		
		System.out.println("Welcome to shoppers");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Are you prime member?");
		
		isPrimeMember = scan.next();
		
		if(isPrimeMember.equals("yes")) {
		System.out.println("You get free shipping!");}
		
		else if(isPrimeMember.equals("no")) {
			
			System.out.println("You must have 35$ or up to get a free shipping!");
		}
		
		else {
			
			System.out.println("The shipping fee is 5$ plus tax and other stuff!");
		}

	}

}
