package day11;

import java.util.Scanner;

public class SwitchStatements2 {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your score4] 1 thru 5!");
		
		
		int grade =in.nextInt ();
	String score = null;
  
        // switch statement with int data type 
        switch (grade) { 
        case 1: score = "fail -gotta work hard";
            break; 
        case 2: score = "fail - must take an exit test!";
        	break;
        
        case 3: score="passing with C";
        	break;
        case 4: score ="passing with B";
        	break;
        case 5: score ="passing with A";
        	break;
        }System.out.println(score);
}
}