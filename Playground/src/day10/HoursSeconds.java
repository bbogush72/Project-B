package day10;
import java.util.*;
public class HoursSeconds {
	
	 
	 public static void main(String[] args)
	    {
		 System.out.println("Enter seconds: ");
	        Scanner in = new Scanner(System.in);
	       
			int seconds = in.nextInt(); 
	        int second = seconds % 60;
	        int hours = seconds / 60;
	        int minutes = hours % 60;
	        hours = hours / 60;
	        System.out.print( hours + " hours," + minutes + " minutes," + second);
			//System.out.print("\n");
	    }    
	 }

