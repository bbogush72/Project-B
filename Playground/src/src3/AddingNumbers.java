package src3;

import java.util.Scanner;

public class AddingNumbers {

		  public static void main(String[] args) {
		    //WRITE YOUR CODE HERE:
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter 3 numbers: ");
		    
		    int num1; int num2; int num3; 
		   
		    
		    num1 = scan.nextInt();
		    num2 = scan.nextInt();
		    num3 = scan.nextInt();
		    
		    System.out.println(" Your first number is: "+ num1);
		    System.out.println(" Your first number is: "+ num2);
		    System.out.println(" Your first number is: "+ num3);
		   
		    int sum = num1+num2+num3;
		    System.out.println("Sum of numbers :"+ sum);
	}

}
