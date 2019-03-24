package day13;

import java.util.*;

public class TipCalc {
  public static void main(String[] args) {
   //WRITE YOUR CODE HERE
   
Scanner s=new Scanner(System.in);
		   
		   System.out.println("Split:");
		   String Split= s.nextLine();
		   
		   System.out.println("Number of people:");
		   int numberOfPeople= s.nextInt();
		   
		   System.out.println("Check amount:");
		   double checkAmount= s.nextDouble();
		   
		   System.out.println("Service Quality:");
		   String serviceQuality= s.next();
		   		   
		   switch(numberOfPeople){
		   case 1:
		   System.out.println("Number of people entered: &");
		   break;		   
		   case 2:
		   System.out.println("Number of people entered: &&");
		   break;		   
		   case 3:
		   System.out.println("Number of people entered: &&&");
		   break;		   
		   case 4:
		   System.out.println("Number of people entered: &&&&");
		   break;		   
		   case 5:
		   System.out.println("Number of people entered: &&&&&");
		   break;		   
		   case 6:
		   System.out.println("Number of people entered: &&&&&&");
		   break;		   
		   case 7:
		   System.out.println("Number of people entered: &&&&&&&");
		   break;		   
		   case 8:
		   System.out.println("Number of people entered: &&&&&&&&");
		   break;
		   default:
		   System.out.println("Sorry we dont have a table to host that large group");
		  }
		   
		   double tipPercent=0;
		   
		   if(serviceQuality.equals("Poor"))
		   tipPercent=0.05;
		   else if(serviceQuality.equals("Fair"))
		   tipPercent=0.1;
		   else if(serviceQuality.equals("Good"))
		   tipPercent=0.15;
		   else if(serviceQuality.equals("Great"))
		   tipPercent=0.2;
		   else if(serviceQuality.equals("Excellent"))
		   tipPercent=0.25;
		   else
		   tipPercent=1.0;
	
		   double tip= tipPercent*checkAmount;
		   
		  System.out.println("Total to pay: "+ (checkAmount + tip));
		  System.out.println("Total tip: "+ tip);
		  
		  if(Split=="no")
		  numberOfPeople=1;
		  
		  System.out.println("Total per person: " + (checkAmount +tip)/numberOfPeople); 
		  System.out.println("Tip per person: "+ tip/numberOfPeople);
	}
}
