package day15;
import java.util.Scanner;
public class Contains {

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	    
	    
	    
	  //Converting both the strings to lower case for case insensitive checking
		System.out.println(sentence.contains(word));
			
		//You can also use the upper case method for the same purpose.
		//System.out.println(word.toUpperCase().contains(sentence.toUpperCase()));
	    
	    
	  }
	}
