package day8;
import java.util.Scanner;
public class BuyIphoneOrIpad {

	public static void main(String[] args) {
		double iPhonePrice= 599.99 , iPadPrice = 899.99, yourBudget;
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a tablet count: ");
		int tabletCount = input.nextInt();
		
		double total = iPadPrice* tabletCount;
		
		System.out.println("Enter the iPhone count: ");
		int iPhoneCount = input.nextInt();
		
		double total1 = iPhoneCount*iPhonePrice;
		System.out.println("Enter your budget: ");
		yourBudget = input.nextDouble();
		
				
		if(yourBudget>=iPhonePrice || yourBudget>=iPadPrice ) {
			
			System.out.println("You can check out your phone/tablet momentarily!");
		}
		
		else if (total1 < yourBudget) {
			System.out.println("you need to pay extra "+ (total1 - yourBudget));
		}
		
		
		else {
			System.out.println("you need to pay extra "+ (total - yourBudget));
		}
	}

}
