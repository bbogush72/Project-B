package day9;
import java.util.Scanner;
public class FibonacciWRecursiveFunctionCall {

		public static void main(String[] args) {
			System.out.println("Please enter a number ");
			Scanner userInput= new Scanner(System.in);
			int fibNum = userInput.nextInt();
			System.out.println("The Fibonacci value of the number is : " + fibTotal(fibNum));
		}
		
		//method calculates the fibonacci value(recursive)
		public static int fibTotal(int fibNum){
			if(fibNum == 0) 
				return 0;
			else if ((fibNum == 1) || (fibNum == 2))
				return 1;
			else 
				return  fibTotal(fibNum-1) + fibTotal(fibNum-2) ;
			}
	}

