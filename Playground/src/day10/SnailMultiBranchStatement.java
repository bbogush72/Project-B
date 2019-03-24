package day10;

import java.util.Scanner;

public class SnailMultiBranchStatement {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char score = 'A';
		char score1 = 'B';
		char score2 = 'C';

		System.out.println("enter your grade: ");
		int grade = in.nextInt();

		if (grade >= 90 && grade <= 100) {
			System.out.println("your grade is " + score);
		}

		else if (grade >= 80 && grade < 90) {
			System.out.println("your grade is " + score1);

		}

		else if (grade >= 70 && grade < 80) {
			System.out.println("your grade is " + score2);

		} else if (grade <= 70 && grade > 0) {
			System.out.println("sorry student, gotta work hard to pass this class next time!");
		}

		else {
			System.out.println("invalid entry, go back and try it again!");
		}

	}

}
