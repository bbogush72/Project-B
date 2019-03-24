package src2;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println(" Greetings, How can I help you today? ");
		String howcan = input.next();
		System.out.println("Your entered: " + howcan);

		System.out.println("What is your name ?");
		String name = input.next();
		System.out.println(" You name is " + name);

		System.out.println("What is your lastname ?");
		String lastname = input.next();
		System.out.println("Your last name is ");

		System.out.println("How old are you ?");
		int age = input.nextInt();
		System.out.println(" You are "+ age + " " + "years old. ");

		System.out.println("Where are you  from ?");
		String country = input.next();
		System.out.println("Your country is " + country);
		
		System.out.println("Where do you live now ?");
		String city = input.next();
		System.out.println(" Your city is "+ city);
		
		System.out.println(" What day you want to visit? Any weekday is ok. ");
		String appointment = input.next();
		System.out.println("You entered: "+ appointment);
		
		System.out.println(" Can you describe your health concern ? ");
		String health = input.next();
		System.out.println("You entered: "+ health);

		System.out.println(" Are you in any pain ? ");
		String pain = input.next();
		System.out.println("You entered: " +pain);

		System.out.println(" Have you been feeling any joint with that rash ? ");
		String feeling = input.next();
		System.out.println("You entered: " + feeling);
		
		System.out.println(" I have times available for Tuesday or Wednesday. Which one would work best for you ? ");
		String times = input.next();
		System.out.println("You entered: "+times);

		System.out.println("Check your info for verification. Your name is " + name + " " + "your last name is "
							+ lastname + "  " + "You are " + age + " " + "years old"
							+ " You are from " + country + " " + "Now you live in " + city + " " 
							+ "Your appointment is on "+ appointment + " "
							+ "You health condition " + health);

	}

}