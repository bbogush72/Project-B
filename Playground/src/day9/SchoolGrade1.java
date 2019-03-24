package day9;
import java.util.Scanner;
public class SchoolGrade1 {

	public static void main(String[] args) {
		String subject1, subject2, subject3, subject4, subject5, subject6;
		float grade1,grade2,grade3,grade4,grade5,grade6;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Grader!");
		System.out.println("Please enter subject name number 1 and score for this subject");
		subject1 = input.nextLine();
		grade1 = input.nextFloat();
		
		System.out.println("Please enter subject name number 2 and score for this subject");
		subject2 = input.next();
		grade2 = input.nextFloat();
		
		System.out.println("Please enter subject name number 3 and score for this subject");
		subject3 = input.next();
		grade3 = input.nextFloat();
		
		System.out.println("Please enter subject name number 4 and score for this subject");
		subject4 = input.next();
		grade4 = input.nextFloat();
		
		System.out.println("Please enter subject name number 5 and score for this subject");
		subject5 = input.next();
		grade5 = input.nextFloat();
		
		 String summary = "Summary:"+subject1 + " - " + grade1 + ", "
                 + subject2 + "-" + grade2 + ", "
                 + subject3 + "-" + grade3 + ", "
                 + subject4 + "-" + grade4 + ", "
                 + subject5 + "-" + grade5  ;
		 
		System.out.println(summary);
		
		float average = (grade1+grade2+grade3+grade4+grade5)/5;
		System.out.println("Your average score is:"+average);
		System.out.println("Thank you for using Grader!");
		System.out.println("Goodbye!");
	}

}
