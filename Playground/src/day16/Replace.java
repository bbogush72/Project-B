package day16;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter a name");
		//String name = scan.nextLine();
		
		
		String str = "Date is 03_25_2019"; // replace underscore with dash char
		
		str= str.replace('_', '-');
		System.out.println(str);
		
		//date is 03-25-2019 ===> Date will be 3-25-2019
		
		str = str.replace("is", "will be");
		
		System.out.println(str);
		
		String str2 = "AAAAAABBBBBCCCCC";
		System.out.println(str2.replace('A', 'Z'));
		
		str = str.replace("Date will be ", "");
		System.out.println(str);
		

	}

}
