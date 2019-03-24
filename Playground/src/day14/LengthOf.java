package day14;
import java.util.Scanner;

public class LengthOf {
  public static void main(String[] args) {
    //WRITER YOU CODE HERE
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the text:");
    
    String a = in.nextLine();
    int b =a.length();
    System.out.println("Length is: "+b);
    // combine // System.out.println("Length is: "+ a.length());
    
    System.out.println("uppercase output: "+a.toUpperCase());
    System.out.println("lowercase output: "+a.toLowerCase());
    
    char secondChar = a.charAt(1);
    System.out.println("2nd character is "+secondChar);
    
  }
}
