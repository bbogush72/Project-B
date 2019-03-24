package day12;

import java.util.Scanner;

public class Grader {
  public static void main(String[] args) {
    // Enter your code here
     String subject1, subject2, subject3, subject4, summary;
     float grade1, grade2, grade3, grade4, average;
     
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Welcome to the Grader!");
     System.out.println("Please enter subject name number 1 and score for this subject");
     subject1 = scan.nextLine();
     grade1 = scan.nextFloat();
     
     System.out.println("Please enter subject name number 2 and score for this subject");
     //IF I USE HERE NEXTLINE IT SHOWS ME ERROR.BUT FIRST LINE I CAN USE NEXTLINE.
	 subject2 = scan.nextLine();
     grade2 = scan.nextFloat();
     
     System.out.println("Please enter subject name number 3 and score for this subject");
     //IF I USE HERE NEXTLINE IT SHOWS ME ERROR.BUT FIRST LINE I CAN USE NEXTLINE.
	 subject3 = scan.nextLine();
     grade3 = scan.nextFloat();
     
     System.out.println("Please enter subject name number 4 and score for this subject");
     //IF I USE HERE NEXTLINE IT SHOWS ME ERROR.BUT FIRST LINE I CAN USE NEXTLINE.
	 subject4 = scan.nextLine();
     grade4 = scan.nextFloat();
     
     summary =subject1 +" - " +grade1 +", " +subject2 +" - " +grade2 +", " + subject3 +" - " +grade3 +", " + subject4 +" - " +grade4 ;
     
     average = (grade1+grade2+grade3+grade4)/4; 
     
     System.out.println("Summary : " +summary);
     
     System.out.println("Your average score is : " + average);
     
     System.out.println("Thank you for using Grader");
     
     System.out.println("Goodbye!");
     
  }
}
