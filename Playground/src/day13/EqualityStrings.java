package day13;

import java.util.Scanner;

public class EqualityStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter two names");
		String name1 = in.nextLine();
		String name2 = in.nextLine();

		if (name1.equals(name2)) {

			System.out.println(name1 + " equals " + name2);
		} else {
			System.out.println(name1 + " not equals " + name2);
		}
		boolean b1 = name1.equalsIgnoreCase(name2);

		System.out.println(b1);

		int countOfCharacter = name1.length();
		System.out.println("character count for " + name1 + " " + countOfCharacter);
		int countOfCharacter1 = name2.length();
		System.out.println("character count for " + name1 + " " + countOfCharacter1);
		
		int count1 =name1.length();
		int count2 =name2.length();
		
		if(count1>count2) {
			System.out.println(name1.charAt(1));
			
		}else {
			System.out.println(name2.charAt(1));
		}
		
		int lastCharIndex= name1.length(); //count1-1
	}

}
