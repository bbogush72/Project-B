package day10;


	import java.util.Scanner;

	public class AmazonPrime2 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Welcome Amazon shopper!");
			System.out.println("Please enter price:");
			double price = scan.nextDouble();
			
			System.out.println("Do you have Amazon Prime membership?: ");
			boolean isPrimeMember = scan.nextBoolean();
			
			if(isPrimeMember ==true || (price > 35))
			{
				System.out.println("Free shipping. Total amount " + price +" dollars ");
			}
			else if(isPrimeMember == false || price<=35)
			{
				price = price+5;
				System.out.println("Add 5$ shipping fee. Total amount" + price +"dollars");
			}
			
		}
		
	}

