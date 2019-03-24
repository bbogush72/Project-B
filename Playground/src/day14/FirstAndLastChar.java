package day14;

import java.util.Scanner;

public class FirstAndLastChar {
  public static void main(String[] args) {
    //DO NOT CHANGE
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //WRITE YOUR CODE HERE
    
    int a = word.length();
    int b = a-1;
    char c =word.charAt(b);
    
    System.out.println("first and last characters are: "+ word.charAt(0)+c);
  }
}
