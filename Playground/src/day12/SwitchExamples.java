package day12;
import java.util.Scanner;
public class SwitchExamples {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	

	char response = 'a';
	System.out.print("Enter command:"); // response = input.nextInt();
	response = input.next().charAt(0); // response = input.next(); //response = input.nextLine();
	String rep;
	switch (response) {
	case 'y' :
		System.out.println("Processing");
	break;
	
	
	case 'n' : rep = "OK";
		System.out.println("Good choice");
	break;
	}
	
	
	}

}
