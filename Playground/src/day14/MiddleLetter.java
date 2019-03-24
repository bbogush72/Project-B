package day14;
import java.util.Scanner;
public class MiddleLetter {
	
	public static String middle(String str) {
		
	   Scanner in = new Scanner(System.in);
       System.out.print("Input a string: ");
       str = in.nextLine();
       System.out.print("The middle character in the string: " + middle(str)+"\n");
   

   
       int position;
       int length;
       if (str.length() % 2 == 0)
       {
           position = str.length() / 2 - 1;
           length = 2;
       }
       else
       {
           position = str.length() / 2;
           length = 1;
       }
       return str.substring(position, position + length);
   }

}
