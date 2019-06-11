package day16;

public class StringEquality {

	public static void main(String[] args) {
		
		
		String s1 = "abc"; //using string literal
		
		String s2 = new String("abc"); //using 'new' keyword
		
		String s3 = s1;
		
		System.out.println(s1.contentEquals(s2));
		
		System.out.println(s1==s3);
		
		System.out.println(s1==s2);
	}

}
