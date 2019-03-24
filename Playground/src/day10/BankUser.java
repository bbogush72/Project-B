package day10;

import java.util.Scanner;

public class BankUser {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String username = "user";
		long accauntnum = 123;
		String password = "pass";

		System.out.println("Welcom to Snail banking app! ");
		System.out.println("Enter your account number");
		username = scan.next();

		System.out.println("Enter your username: ");
		username = scan.next();

		System.out.println("Enter your password:");
		password = scan.next();

		// boolean notauser = username.equals("user");
		// boolean correct = password.equals("pass");

		if (username.equals("user") && password.equals("pass"))

			System.out.println("Login successful");
		else
			System.out.println("Login failed");

	}

}
