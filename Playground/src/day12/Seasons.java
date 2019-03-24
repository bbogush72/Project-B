package day12;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		// if 3-4-5 as spring / 6-7-8 as summer / 9-10-11 fall / 12 - 1- 2 as winter
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number 1-12 to identify seasons:");
		int MonthNumber = in.nextInt();
		String seasons;
		switch (MonthNumber) {

		case 1:
			
		case 2:
			
		case 12:
			seasons = "Winter";
			break;
		case 3:
			
		case 4:
			
		case 5:
			seasons = "Spring";
			break;
		case 6:
			
		case 7:
			
		case 8:
			seasons = "Summer";
			break;
		case 9:
			
		case 10:
			
		case 11:
			seasons = "Fall";
		default:
			seasons = "invalid selection";

		}

		System.out.println("It's " + seasons);

	}

}
