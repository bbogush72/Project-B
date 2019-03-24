package day11;
import java.util.Scanner;
public class TernaryFizz {
	
	  public static void main(String[] args) {
	    
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("enter a number:");
	    int num=scanner.nextInt();
	    


	    String result= (num%5==0 && num%3==0)? "fizz buzz" : 
	    			   ((num%5==0) ? "fizz":
	    			   (num%3==0) ? "buzz":"not divisible by any of these ");   
	    
	    
	    System.out.println(result);
	  }

	}

