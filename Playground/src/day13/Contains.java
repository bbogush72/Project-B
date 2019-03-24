package day13;

public class Contains {

	public static void main(String[] args) {
		String s1 = "Ozlem";
		
		boolean eExistOrNot = s1.contains("e");
		
		System.out.println("Does name contain e : "+ s1.contains("e"));
		
		System.out.println("What is the position of e: "+ s1.indexOf("e"));
		
		
		
		String partOfString = s1.substring(1, 3);
		System.out.println("part of string "+  s1.substring(1, 5));
		
		

	}

}
