package day9;
import java.util.Scanner;
public class SchoolGrades {

	public static void main(String[] args) {
		
			    
		    Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Welcome to the Grader!");
		    System.out.println("Please enter subject name number 1 and score for this subject");
		    String subject1 = scan.next();
		    float grade1 = scan.nextFloat();
		    
		    System.out.println("Please enter subject name number 2 and score for this subject");
		    String subject2 = scan.next();
		    float grade2 = scan.nextFloat();
		    
		    System.out.println("Please enter subject name number 3 and score for this subject");
		    String subject3 = scan.next();
		    float grade3 = scan.nextFloat();
		    
		    System.out.println("Please enter subject name number 4 and score for this subject");
		    String subject4 = scan.next();
		    float grade4 = scan.nextFloat();
		    
		    System.out.println("Please enter subject name number 5 and score for this subject");
		    String subject5 = scan.next();
		    float grade5 = scan.nextFloat();
		    
		    String summary = subject1 + " - " + grade1 + ","
		                    + subject2 + " - " + grade2 + ","
		                    + subject3 + " - " + grade3 + ","
		                    + subject4 + " - " + grade4 + ","
		                    + subject5 + " - " + grade5  ;
		                   
		    float average = (grade1 + grade2 + grade3 + grade4 + grade5 )/5 ;
		    
		    System.out.println("Summary: " + summary);
		    System.out.println("Your average score is: " + average);
		    System.out.println("Thank you for using Grader!");
		    System.out.println("Goodbye!");
		    }


	}


