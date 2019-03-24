package day12;
import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		
		System.out.println("Enter any two numbers:");
		
		Scanner in=new Scanner(System.in);

		double num1=in.nextDouble();
		double num2=in.nextDouble();
		System.out.println("Enter an operation from the following:+, -, *, /  ");
		String operator=in.next();
		
		switch(operator) {
		case "+":
			System.out.println("The addition result is: " +(num1+num2));
			break;
		case "-":
			System.out.println("The subtraction result is:" +(num1-num2));
			break;
		case "*":
			System.out.println("The multiplication result is:" +(num1*num2));
			break;
		case "/":
			System.out.println("The division result is:" +(num1/num2));
			break;
		 default:
  		   System.out.println("Try Again");
  		   break;
		}
	}
}