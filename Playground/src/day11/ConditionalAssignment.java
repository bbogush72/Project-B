package day11;

import java.util.Scanner;

public class ConditionalAssignment {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int score;
		String result;

		score = scan.nextInt();

		if (score > 75) {

			result = "Passed";

		} else
			result = "Failed";

		System.out.println(result);
	}

}
