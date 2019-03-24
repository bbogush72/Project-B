package src2;
import java.util.Scanner;
public class UsingcomparisonOp {

	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//ask user question
		System.out.println(" Enter number 1: ");
		int num1 = input.nextInt();
		System.out.println(" Enter number 2: ");
		int num2 = input.nextInt();
		
		boolean isGreater = num1 > num2;
		
		System.out.println(" Is number 1 greater than number 2? : " + isGreater);
		
	}

}
