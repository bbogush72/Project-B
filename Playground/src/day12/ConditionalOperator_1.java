package day12;

import java.util.*;

public class ConditionalOperator_1 {
  public static void main(String[] args) {
    //DO NOT CHANGE
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number:");
		int x = scan.nextInt();
		//WRITE YOUT CODE HERE
		
		int value;
		value = x>=5 ?  x:5;
	
		value = -x<5 ? -x:5;
		System.out.println(value);
		
		
		
  }
}
