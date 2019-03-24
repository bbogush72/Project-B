package day10;

import java.util.Scanner;

public class SnailLogin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter user name and password: ");
		String u = "alf";
		String p = "123";

		String user = in.nextLine();
		String pw = in.nextLine();
		
		//boolean userExists = username.equals("user");
		//boolean passwordCorrect = password.equals("123");
		

		if (user.equals(u) && pw.equals(p)) {
			System.out.println("Login successful");
		}

		else {

			System.out.println("Login failed");
		}

		String k = "Fred";

		System.out.println("if you are an admin, enter your digit password");

		String admin = in.nextLine();

		if (admin.equals(k)) {

			System.out.println("Admin credentials active!");
		}
	}

}
