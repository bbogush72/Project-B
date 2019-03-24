package day10;

import java.util.Scanner;

public class ConditionPractice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find out whether the number is odd or even: ");

		int k = input.nextInt();

		if ((k % 2 == 0) && (k!=0)) {

			// int i = 10, j = 10;
			// if ((i > 5) && (j % 2 == 0) && (j + i == 30)) {

			System.out.println("Bingo, it's an even number, way to go!");

		} else {
			System.out.println("Not an even number, too bad!");
		}

	}
}
