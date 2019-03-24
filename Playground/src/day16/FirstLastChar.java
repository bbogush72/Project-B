package day16;
import java.util.Scanner;
public class FirstLastChar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name=in.nextLine();
		
		int a = name.length();
	    int b = a-1;
	    char c =name.charAt(b);
	
		
		System.out.println("First and Last characters are: "+name.charAt(0)+" "+name.charAt(b));
		
		char c1 = name.charAt(0);
		int cNum =c1;
		System.out.println(name.charAt(0)+" "+"in unicode: "+cNum);
		
		char c2 = name.charAt(b);
		int cNum2 =c2;
		
		System.out.println(name.charAt(b)+" in unicode: "+cNum2);
		
		
		
	}

}
