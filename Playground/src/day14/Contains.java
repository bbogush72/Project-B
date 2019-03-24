package day14;

import java.util.Scanner;

public class Contains {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter words");
    String word = scan.next();
    
    boolean a=word.contains("a");
    System.out.println("contains a: "+a);
    
    boolean b1 = word.equalsIgnoreCase("a");
    System.out.println("boolean b1: "+b1);
    System.out.println("location of a: "+word.indexOf("a"));
    
    
    System.out.println("location of aw: "+word.toLowerCase().indexOf("aw"));

	}

}
