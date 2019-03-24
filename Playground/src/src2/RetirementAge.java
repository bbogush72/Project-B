package src2;
import java.util.Scanner;
public class RetirementAge {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	System.out.println(" Greetings: Let's calculate when you retire?");
	
	System.out.println(" What is your age?");
	//userinput
	int age = input.nextInt();
	
	System.out.println(" You age is = "+ age);
	
	System.out.println("Enter the current year: ");
	int year = input.nextInt();
	System.out.println("The current year is = "+ year);
	
	System.out.println(" Enter the year when you first started working: ");
	int firstWorkDay = input.nextInt();
	System.out.println("You first started working in = " + firstWorkDay);
	
	int howLong;
	howLong= year-firstWorkDay;
	System.out.println("Your work years in total= "+howLong);
	
	int retire;
	retire= 40 - howLong;
	
	System.out.println("You retire in "+ retire + " years/months");
	
	System.out.println("Your age is " + (age - year) );
	
	}

}
