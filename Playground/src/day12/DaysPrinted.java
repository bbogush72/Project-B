package day12;

import java.util.Scanner;

public class DaysPrinted {

	public static void main(String[] args) {

		int dayNum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		dayNum = scan.nextInt();
		String DaysOfWeek;

		switch (dayNum) {
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5: DaysOfWeek = "Weekday";
			
		break;
		
		case 6:
		case 7: DaysOfWeek = "Weekend";
			break;
		default:
			DaysOfWeek = "Your entry is invalid, please try again!";
			break;

		}
		System.out.println("It's : " + DaysOfWeek);
	}
}
