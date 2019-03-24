package src2;

import java.util.Scanner;

public class BirthDate {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println(" What is your birth date: ");
		int birthYear = input.nextInt();
		int age = 2019 - birthYear;
		
		System.out.println("Your age is " + age);
		
		System.out.println("Are you hungry:");
        boolean isHungry = input.nextBoolean();
        if(isHungry == true)
        {
        System.out.println("Go eat dinner");
        }
        else
        {
        System.out.println("Let's continue coding");
	}

}
}