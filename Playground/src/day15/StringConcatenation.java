package day15;

import java.util.Scanner;
		public class StringConcatenation {
		  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //WRITE YOUR CODE HERE
		    
		    //System.out.println(word1+ ""+word2);
		    
		    int a = word1.length();
		    int b = word2.length();
		    
		    if (word2.charAt(0)== (word1.charAt(word1.length()-1))){
		      System.out.println (word1+ word2.substring(1, word2.length() -1)); 
		    } 
		    else {System.out.println (word1 + word2);} 
		  }
		}
