package day10;

import java.util.Scanner;

public class MathLab {

	public static void main(String[] args) {

		System.out.println("Welcome to Math Library!");

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two numbers: ");

		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println("You entered these numbers: " + a + " - " + b);

		if (a + b > 100) {
			System.out.println("You entered great numbers > 100");
		}

		else {
			System.out.println("Looks like your sum is less than 100");
		}
	}

}
