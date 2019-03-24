package day12;
import java.util.Scanner;
public class test {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	System.out.println("what is the farthest planet in the solar system:" );
    System.out.println("a)venus" );
    System.out.println("b)pluto" );
    System.out.println("c)neptune" );
  
  String answer = scan.nextLine();
  String a = "a" ;
  String b = "b" ;
  String c = "c" ;
  

    if(answer.equals(a)){
      System.out.println("a is wrong");
    }else if(answer.equals(b)){
      System.out.println("b is correct");
    }else if(answer.equals(c)){
      System.out.println("c is wrong");
    }else {
      System.out.println("is not a valid answer");
    }
  
  }
}

