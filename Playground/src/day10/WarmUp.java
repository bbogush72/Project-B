package day10;
import java.util.Scanner;
public class WarmUp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long accountNumber = 9870L;
		String password = "270";

		System.out.println("Enter your account number:");
		accountNumber = scan.nextLong();
		System.out.println("Enter your password");
		password = scan.next();

		if (accountNumber == 9870 && password.equals("270"))
			System.out.println("login successful");
		else
			System.out.println(" login failed");

	}

}
