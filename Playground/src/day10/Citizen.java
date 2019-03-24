package day10;

import java.util.*;

public class Citizen {

	public static void main(String[] args) {
		// WRITE YOUR CODE HERE
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		int seniorCitizens = scan.nextInt();
		int nonSeniorCitizens = scan.nextInt();

		System.out.println("What is new citizen's age?");
		int age = scan.nextInt();

		if (age >= 65) {
			System.out.println("Senior Citizen" + "\n" + "New seniorCitizens count " + ++seniorCitizens + "\n"
					+ "New nonSeniorCitizens count " + nonSeniorCitizens);
		} else if (age < 65) {
			System.out.println("Non-Senior Citizen " + "\n" + "New nonSeniorCitizens count" + ++nonSeniorCitizens + "\n"
					+ "New seniorCitizens count " + seniorCitizens);
		} 

	}
}
