package day10;
import java.util.Scanner;
public class HoursSeconds1 {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter seconds:");
	    int inputSeconds = in.nextInt();
	    
	    
	    int hours = inputSeconds/3600 ;
	    int minutes = (inputSeconds%60)/60;
	    int seconds = (hours%3600)%60;
	     
	       System.out.println(hours+" hours, "+minutes+" minutes, "+ seconds + " seconds");
	     }
	     
	     //System.out.println(()+" "+ ()+" "+())
	     
	   }
	 


