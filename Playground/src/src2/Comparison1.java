package src2;

import java.util.Scanner;

public class Comparison1 {
	
		  public static void main(String[] args) {
			 Scanner input = new Scanner(System.in);  // creating scanner object
		    // if you have too number how to compare them 
		    int a = 11 , b = 11 ; 
		    
		    // checking for equality    --  == 
		    System.out.println("is a and b equal : "  + (a == b)  );
		    
		    // checking for inequality    --  != 
		    System.out.println("is a and b not equal : "  + (a != b)  );
		    
		    // checking for greater or equal    --  >= 
		    System.out.println("is a greater or equal to b : "  + (a >= b)  );
		        
		    // checking for greater         --  >  
		    System.out.println("is a greater than b : "  + (a > b)  );
		    
		    // checking for less or equal    --  <= 
		    System.out.println("is a less or equal to b : "  + (a <= b)  );
		            
		    // checking for less than         --  <  
		    System.out.println("is a less than b : "  + (a < b)  );
		        
		        
		    boolean isAequalToB = (a==b) ; 
		 
		   
		     
		      
		    // ask user questions 
		    System.out.println("Enter number 1 : ");
		    int num1 = input.nextInt();
		    System.out.println("Enter number 2 : ");
		    int num2 = input.nextInt();
		    
		    boolean isGreater = num1 > num2 ;  
		    
		    System.out.println( "IS NUMBER1 GREANER THAN number 2 : " +  isGreater );
		    

		  }

		}

