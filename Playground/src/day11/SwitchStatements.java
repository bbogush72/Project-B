package day11;
import java.util.Scanner;
public class SwitchStatements {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a day number!");
		
		
		int day =in.nextInt ();
		
        String dayString; 
  
        // switch statement with int data type 
        switch (day) { 
        case 1: 
            dayString = "Monday"; 
            break; 
        case 2: 
            dayString = "Tuesday"; 
            break; 
        case 3: 
            dayString = "Wednesday"; 
            break; 
        case 4: 
            dayString = "Thursday"; 
            break; 
        case 5: 
            dayString = "Friday"; 
            break; 
        case 6: 
            dayString = "Saturday"; 
            break; 
        case 7: 
            dayString = "Sunday"; 
            break; 
        default: 
            dayString = "Invalid day"; 
            break; 
        } 
        
        System.out.println(dayString); 
    		}

	}


