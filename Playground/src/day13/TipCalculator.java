package day13;

import java.util.*;

public class TipCalculator {
	public static void main(String[] args) {
		// WRITE YOUR CODE HERE

		Scanner in = new Scanner(System.in);
		System.out.println("Split: ");
		String split = in.next();

		System.out.println("Enter number of people");
		int numOfPeople = in.nextInt();

		System.out.println("Check amount:");
		double totalCost = in.nextDouble();
		
		double tipPercent;

		System.out.println("Enter service quality");
		String serviceQuality = in.nextLine();

		
		switch (numOfPeople) {

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
		
		
		if(serviceQuality.equalsIgnoreCase("poor")) {
			tipPercent=0.05;
		}else if(serviceQuality.equalsIgnoreCase("fair")) {
			tipPercent=0.10;
		}else if(serviceQuality.equalsIgnoreCase("good")) {
			tipPercent=0.15;
		}else if(serviceQuality.equalsIgnoreCase("great")) {
			tipPercent=0.20;
		}else if(serviceQuality.equalsIgnoreCase("excellent")) {
			tipPercent=0.25;
		}else {
			tipPercent=1.0;
		}
		
		double tip = tipPercent*totalCost;
		
		System.out.println("Total to pay "+ (totalCost+tip));
		
		System.out.println("Total tip "+tip);
		
		if(split=="no") {
			numOfPeople =1;
			System.out.println("Total per person: " + (totalCost +tip)/numOfPeople); 
			  System.out.println("Tip per person: "+ tip/numOfPeople);
		}
	}
}
