package day11;
import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int number;
		System.out.println("Enter a number");
		number=scan.nextInt();
		if (number%5==0 && number%3==0) {
			System.out.println("FIZZ BUZZ");
		}else if (number%5==0) {
			System.out.println("FIZZ");
		}else if (number%3==0) {
			System.out.println("BUZZ");
		}else {
			System.out.println("Try Again");
		}

	}

}
