package day12;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
	   
		String weather;
	    String action=" ";
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("What is the weather like:");
	    weather=scan.nextLine();
	    
	    action= weather.equals("sunny")? "go spree":
	    	
	    		weather.equals("rainy")? "stay at home do some code": 
	    			
	    		weather.equals("cloudy")? "why stay home if you must go":
	    		
	    		weather.equals("rainy")? "stay at home do some code": action;
	    
	    		System.out.println(action);
	 
	  }

	}
		
	

