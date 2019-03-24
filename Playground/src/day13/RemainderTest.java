package day13;

import java.util.Scanner;

public class RemainderTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter numbers to slice'em all!");
		int num = in.nextInt();
		String str = String.valueOf(num);

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));

	}

}
