package day12;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		/*
		 * str1.equals(str2) - check equality for case sensitivity
		 * str1.equalsIgnoreCase(str2) - check for equality with case insensitive.
		 * 
		 * str1.toUpperCase() - return original string with uppercase
		 * 
		 * str1.toLowerCase() - return original string with lowercase
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("how is weather today?");

		String weather = s.next();

		weather = weather.toLowerCase();

		switch (weather) {
		case "sunny":
			System.out.println("go swimming");
			System.out.println(weather.toLowerCase());
			break;

		case "windy":
			System.out.println("get your jacket");

			System.out.println("it is " + weather.toUpperCase());
			break;
		}
	}

}
