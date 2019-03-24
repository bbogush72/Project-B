package src2;

import java.util.Scanner;

public class celcius {
public static void main(String[] args) {
	
	double fahrenheit = 80;
	double celcius =(5/9d)*(fahrenheit -32);
    
    
    System.out.println(celcius);
    
    Scanner keyboard = new Scanner(System.in);
    int a;
	        
    System.out.println("Add the fahrenheit value for conversion: \n");
    int userInput = keyboard.nextInt();
    System.out.println(a =(int) ((5/9d)*(userInput -32)));
    
}
}