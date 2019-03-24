package Perishables;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		//create scanner object
	Scanner input = new Scanner(System.in); 
	
		//output the prompt
	System.out.println("Enter a number: ");
	
	//wait for the user to enter a text
	//String line  = input.nextLine();
	
	double value = input.nextDouble();
	
	//tell them what they entered.
	System.out.println("You entered: " +value);
	
	

	}

}
