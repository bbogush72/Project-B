package day16;

import java.util.Scanner;

public class StartsEndsWith {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = scan.nextLine();

		boolean NameStartsWith = name.startsWith("A");
		boolean NameEndsWith = name.endsWith("a");

		if (NameStartsWith == true) { // or if(NameStartsWith) same
			System.out.println("Name matches");

		} else {
			System.out.println("no match");
		}

		System.out.println("Name starts with A" + NameStartsWith);
		System.out.println("Name ends with a" + NameEndsWith);

		int index1 = name.lastIndexOf("a");
		System.out.println(index1);
		
		int count = name.length();
		
		

		}
	
	}


