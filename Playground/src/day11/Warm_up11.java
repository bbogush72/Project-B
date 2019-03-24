package day11;

import java.util.Scanner;

public class Warm_up11 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("What is your number? ");

		int Num = in.nextInt();

		if (Num % 3 == 0 && Num % 5 == 0) {
			System.out.println("Fizz Buzz!");}

		else if (Num % 5 == 0) {
			
			System.out.println("Fizz!");}
		
		else if (Num % 3 == 0) {
			
			System.out.println("Buzz!");}

		else {
			System.out.println("Try again!!!");

		}
	}

}
