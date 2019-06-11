package day16;

import java.util.Scanner;

public class NameCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = scan.nextLine();
		
		int count = name.length();
		if (count>2) {
			if(count%2==1) {
				//01234  ==>5 character
			    //Adaam    5/2=2
				int mindIndex = count/2;
				System.out.println(name.charAt(mindIndex));
				
			}else {
				
				int midIndex = count/2;
				char midL = name.charAt(midIndex);
				char midR = name.charAt(midIndex-1);
				System.out.println(""+midR+midL);
			}
			
		}

	}

}
