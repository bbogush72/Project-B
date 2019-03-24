package day12;
import java.util.Scanner;
public class CalculatorIfElse {

	public static void main(String[] args) {
		// ask 2 numbers from the user
		// ask the operation, too.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to calculate");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Add an operator from the following: (+, -, *, /)");
		
		String operator = scan.next();
		
		if(operator.equals("+")){
			System.out.println("the addition result is "+ (num1+num2));}
			
		else if(operator.equals("-")){
			System.out.println("the subtraction result is "+ (num1-num2));}
		else if(operator.equals("*")){
			System.out.println("the multiplication result is "+ (num1*num2));}
		else if(operator.equals("/")){
			System.out.println("the division result is "+ (num1/num2));}
		else {
			System.out.println("invalid operator");
		}

	}

}
