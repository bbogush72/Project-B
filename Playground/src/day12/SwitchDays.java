package day12;

import java.util.Scanner;

public class SwitchDays {
	public static void main(String[] args) {

		int dayNum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		dayNum = scan.nextInt();
		String DaysOfWeek;

		switch (dayNum) {
		case 1:
			DaysOfWeek = "Sunday";
			break;
		case 2:
			DaysOfWeek = "Monday";
			break;
		case 3:
			DaysOfWeek = "Tuesday";
			break;
		case 4:
			DaysOfWeek = "Wednesday";
			break;
		case 5:
			DaysOfWeek = "Thursday";
			break;
		case 6:
			DaysOfWeek = "Friday";
			break;
		case 7:
			DaysOfWeek = "Saturday";
			break;
		default:
			DaysOfWeek = "Your entry is invalid, please try again!";
			break;

		}
		System.out.println("It's a: " + DaysOfWeek);
	}
}
