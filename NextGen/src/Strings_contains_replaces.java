public class Strings_contains_replaces {
	public static void main(String []args) {
		
		String s= "Welcome";
		String y= " to Garland";
		
		
		System.out.println("string s contains: " + s.length() + " characters");
		System.out.println("string y contains: " + y.length() + " characters");
		
		System.out.println(s + y);
		
		//replaces
		System.out.println("-----------------Replaces--------------------");
		System.out.println(s.replace(s, "Hosgeldiniz"));
		
		//contains 
		System.out.println("-----------------contains--------------------");
		System.out.println(y.contains("Garland"));
		
		//
		
		
	}
}
