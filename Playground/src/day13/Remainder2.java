package day13;

public class Remainder2 {

	public static void main(String[] args) {
		
		int num = 45678;
		String str = String.valueOf(num);
		
		// to get first character
		System.out.println(str.charAt(0));
		
		// 45678 / 10000 = 4
		int digit1 = num / 10000;
		
		
		// 45678 / 1000 = 45, then we are dividing 45 by 10, to get the remainder, and
		// remainder will be = 5
		
		int digit2 = num / 1000 % 10;
		// 45678 / 100 = 456, then we are dividing 456 by 10, to get the remainder, and
		// remainder will be = 6
		int digit3 = num / 100 % 10;
		// 45678 / 10 = 4567, then we are dividing 4567 by 10, to get the remainder, and
		// remainder will be = 7
		int digit4 = num / 10 % 10;
		// we are dividing 45678 / 10 to get the remainder, and remainder will be = 8
		int digit5 = num % 10;
		System.out.println("Number 1: " + digit1);
		System.out.println("Number 2: " + digit2);
		System.out.println("Number 3: " + digit3);
		System.out.println("Number 4: " + digit4);
		System.out.println("Number 4: " + digit5);

	}

}
