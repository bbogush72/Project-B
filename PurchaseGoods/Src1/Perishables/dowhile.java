package Perishables;
import java.util.Scanner;
public class dowhile {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("Enter a number: ");
				int value = scanner.nextInt();
				while(value != 5) {
		System.out.println("Enter a number: ");
			*/
		int value = 0;
		
		do {
			System.out.println("Find my number: Enter a number from 1 to 10: ");
			value = scanner.nextInt();
		
		}
		
		while(value != 5); {
			System.out.println("You got it right 5 it is!");
		}
		
	}
	
}
		


