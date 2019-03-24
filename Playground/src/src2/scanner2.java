package src2;
import java.util.Scanner;
public class scanner2 {

	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//ask user a question
		
		System.out.println("name: ");
		
		//force user to enter input/ data
		
		String firstName = input.next();
		
		//and format the display
		System.out.println("your first name is " + firstName);
		System.out.println("last name is ");
		
		String lastName = input.next();
				
		System.out.println("last name is " + lastName);
		
		System.out.println("your full name is " + firstName + " " + lastName);
		

        System.out.println("Enter your age: ");
        String age = input.next();
        System.out.println("Your age is " + age);
        
        System.out.println(" Enter your city: ");
        String city = input.next();
        System.out.println("Your city is " + city);
        
        System.out.println(" Enter your nationality:");
        String nation = input.next();
        System.out.println(" Your nationality is " + nation );
		
        
        System.out.println(firstName + " " + lastName+ " "+ "is " + " "+ age+ " years old. "+" "+
        					firstName+ " " + " from "+city+" and "+ firstName+ " is "+nation);

	}

}
