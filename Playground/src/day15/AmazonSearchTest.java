package day15;

import java.util.Scanner;
public class AmazonSearchTest {

	public static void main(String[] args) {
		// ask users item to search
		// verify the tab name has changed to amazon.com: Your text
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter what you want to search ");
		
		String itemsToSearch = scan.nextLine();
		System.out.println("You entered: "+ itemsToSearch);
		
		//amazon.com : itemsToSearch
		
		String expectedResult = "Amazon.com : "+itemsToSearch;
		String actualResult = "amazon.com : "+itemsToSearch;
		
		if(expectedResult.equalsIgnoreCase(actualResult)) {
			System.out.println("Passed the test!");
		}else{System.out.println("Failed the test!");}
		
}
}
