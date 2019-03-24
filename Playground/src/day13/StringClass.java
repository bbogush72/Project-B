package day13;

public class StringClass {

	public static void main(String[] args) {
		
		String s = "abc";
		String s2 = "ABC";
		
		boolean b1 = s.equals("abc"); //true
		boolean b2 = s.equals(s2);    //false
		boolean b3 = s.equalsIgnoreCase(s2);
		
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println( s+ " to "+ s.toUpperCase());
		System.out.println( s2+ " to "+ s.toLowerCase());
		
		char c1 = s.charAt(0);
		char c2= s.charAt(1);
		char c3 = s.charAt(2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("charAt calls "+s.charAt(1));
		
		
		// getting the length of string object
		
		int countOfCharacter = s.length();
		System.out.println("character count for "+countOfCharacter);
		
		
	    }
	
	}


