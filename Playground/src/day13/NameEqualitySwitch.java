package day13;

import java.util.Scanner;

public class NameEqualitySwitch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 names");
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();

		int Name1Length = (name1.length());
		int Name2Length = (name2.length());

		if (Name1Length > Name2Length) {
			System.out.println(name2);
	    
		} else {
			System.out.println("third character ");
		}

		int lastCharIndex= Name1Length - 1;
		char lastChar = name1.charAt(lastCharIndex);

		switch (lastChar) {

		case 'a':
		      System.out.println("name as ended with a ");
		      break;
		    case 'b':
		      System.out.println("name as ended with b ");
		      break;
		    case 'c':
		      System.out.println("name as ended with c ");
		      break;
		    default:
		      System.out.println("NO MATCH AT ALL ");

		}

	}

}
