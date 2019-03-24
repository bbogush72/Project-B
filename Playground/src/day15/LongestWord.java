package day15;

import java.util.Scanner;

public class LongestWord {
  public static void main(String[] args) {
    //DO NOT CHANGE
    Scanner scan = new Scanner(System.in);
    String word1 = scan.next();
    String word2 = scan.next();
    //WIRTE YOUR CODE HERE
    
    int a = word1.length();
    int b= word2.length();
    
    if(a>b) {
    	System.out.println(word1);
    }else if(b>a) {
    	System.out.println(word2);
    }else {
    	System.out.println(word1 + " "+word2);
    }
    	
   
    
  }
}
