package day16;

public class StringProblems {

	public static void main(String[] args) {
		
					//string literal
		String str1 = "Sunday is Java day";
		String str = new String("Sunday is Java Day");
		String up = str.toUpperCase();
		System.out.println(up);
		
		int count = str.length();
		//using charAt
		
		char last = str.charAt(count-1);
		char first = str.charAt(count-2);
		System.out.println(first+""+last    ); // or line 19
		System.out.println(str.substring(count-2, count)); // or line 20
		System.out.println(str.substring(count-2));
		
		
		int positionOfIs = str.indexOf("is");
		System.out.println(positionOfIs);
		
		int x =  str.indexOf(97);
		System.out.println(x);
		
		System.out.println(str.contains("Java"));
		System.out.println(str.indexOf("Java")>-1);
	}

}
