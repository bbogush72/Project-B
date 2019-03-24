package day10;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {

		String name = "Sen";

		boolean b = name.equals("Ben");

		System.out.println(b);

		Scanner in = new Scanner(System.in);

		System.out.println("guess my name: ");

		String a = in.nextLine();

		if (a.equals(name)) {
			System.out.println(a + " it is, yep, that's my name");
		} else {
			System.out.println("not my name");
		}
	}
}
