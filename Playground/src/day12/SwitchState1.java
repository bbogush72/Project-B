package day12;

import java.util.Scanner;

public class SwitchState1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char response = 'a';
		System.out.print("Enter command:");
		response = input.next().charAt(0);

		switch (response) {
		case 'y':
			System.out.print("Your request is being processed");
			break;
		case 'n':
			System.out.print("Thank you anyway for your consideration");
			break;
		case 'h':
			System.out.print("Sorry, no help is currently available");
			break;
		default:
			System.out.print("Invalid entry, please try again");
		}
	}

}
