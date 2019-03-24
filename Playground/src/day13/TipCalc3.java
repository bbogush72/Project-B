package day13;

import java.util.*;

public class TipCalc3 {
	public static void main(String[] args) {
		// WRITE YOUR CODE HERE
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Split:");
		String Split = scan.next();
		
		System.out.println("Number of people:");
		int numberOfPeople = scan.nextInt();
		
		System.out.println("Check amount:");
		double checkAmount = scan.nextDouble();
		
		System.out.println("Service Quality:");
		String serviceQuality = scan.next();
		
		String SnumofPeople;
		double totalTip, totalPay, totalPerPerson, tipPerPerson;
		switch (numberOfPeople) {
		case 1:
			SnumofPeople = "&";
			break;
		case 2:
			SnumofPeople = "&&";
			break;
		case 3:
			SnumofPeople = "&&&";
			break;
		case 4:
			SnumofPeople = "&&&&";
			break;
		case 5:
			SnumofPeople = "&&&&&";
			break;
		default:
			SnumofPeople = "";
			break;
		}
		if (serviceQuality.equalsIgnoreCase("Poor")) {
			totalTip = checkAmount * 5 / 100;
		} else if (serviceQuality.equalsIgnoreCase("Fair")) {
			totalTip = checkAmount * 10 / 100;
		} else if (serviceQuality.equalsIgnoreCase("Good")) {
			totalTip = checkAmount * 15 / 100;
		} else if (serviceQuality.equalsIgnoreCase("Great")) {
			totalTip = checkAmount * 20 / 100;
		} else if (serviceQuality.equalsIgnoreCase("Excellent")) {
			totalTip = checkAmount * 25 / 100;
		} else {
			totalTip = 0;
		}
		totalPay = checkAmount + totalTip;
		totalPerPerson = totalPay / numberOfPeople;
		tipPerPerson = totalTip / numberOfPeople;
		System.out.println("Number of people entered: " + SnumofPeople);
		System.out.println("Total to pay: " + totalPay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);

	}
}
