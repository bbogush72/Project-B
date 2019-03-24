package day11;

import java.util.Scanner;

public class TernaryFizzBuzz {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number to be buzzed or fizzed!");
		
		int number = scan.nextInt();
		
		String result;
		result = number%5==0 & number%3==0 ? "Fizz Buzz" :
			
				 number%5==0 ? "Fizz": 
					 
				 number%3==0 ? "Buzz": "non divisible";
		
		
		
		System.out.println("it is "+result);
	}

}



