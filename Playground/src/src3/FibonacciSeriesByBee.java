package src3;

import java.util.Scanner;

public class FibonacciSeriesByBee {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		/*
		 * System.out.println("Enter the first number 0: "); int set; int num =
		 * a.nextInt(); System.out.println("the initial value = "+(set =num+0));
		 * 
		 * System.out.println("Enter the second number 1: "); int num1 = a.nextInt();
		 * System.out.println("the second value = "+(set =num+1));
		 * 
		 * 
		 * System.out.println("Enter the third number 2: "); int num2 = a.nextInt();
		 * System.out.println("the third value = "+(set =num2-1));
		 */

		int n = 10;
		int num1 = 0;
		int num2 = 1;
		if (n < 90) {
			System.out.println("first " + n + " numbers: ");
			for (int i = 1; i <= n; i++) {
				System.out.println(num1 + " ");

				int total = num1 + num2;
				num1 = num2;
				num2 = total;
			}

		}

	}
}
