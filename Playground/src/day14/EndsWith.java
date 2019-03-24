package day14;

import java.util.Scanner;

public class EndsWith {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    
    //int lastIndex = str.length()-1
    //str.charAt();
    int a = word.length();
    
    int b = a-1;
    
    char c = word.charAt(b);
    System.out.println("last char: "+c);
    
    System.out.println("location 2 to 5:  "+word.substring(2,5));
    System.out.println(" "+ word.charAt(0)+word.charAt(1));
    
    System.out.println(word.substring(a-2, a));//a is count
    
  }
}