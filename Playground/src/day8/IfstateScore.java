package day8;

import java.util.Scanner;

public class IfstateScore {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your score: ");
		int score = input.nextInt();

		// int score = 59;

		System.out.println("Current score is " + score);

		if (score < 60) {
			System.out.println("You do some reading");
		} else if (score > 59) {
			System.out.println("Good job!");
		} else {
			System.out.println("Study more and get your grades up!");
		}
	}

}
