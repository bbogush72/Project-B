package day11;

import java.util.*;

public class WordsEquals {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String word1 = s.next();
    String word2 = s.next();
    
    //your code here
    
    if(word1.equals(word2)) {
    	System.out.println(word1 + " equals "+ word2);
    }
    
    else {
    	System.out.println(word1+ " does not equal "+word2);
    }
    
}
}