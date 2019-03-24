package day10;

import java.util.Scanner;

public class WarmUpDay10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Cybertek Banking App!");
		
		System.out.println("What is your last 4 of your account number and password? ");
		
		long AccountNum = 1234L;
		
		String pass = "12345";
		
		
		Long userName = scan.nextLong();
		String pw = scan.next();
		
		if((userName == AccountNum) && (pass.equals(pw))) {
			System.out.println("Login Success");
			
		}
		
		else {
			System.out.println("Login fail!");
		}
	}

}
