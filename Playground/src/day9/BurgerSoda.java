package day9;

import java.util.Scanner;

class BurgerSoda {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter values");
		String in = s.next();

		// your code here
		float a = (float) 10.0;
		float b = (float) 2.0;
		if (in.equals(("burger")) || in.equals("chicken")) {
			System.out.println(a);
		}

		if (in.equals("soda")) {
			System.out.println(b);
		}
	}
}