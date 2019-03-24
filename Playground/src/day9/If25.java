package day9;
import java.util.Scanner;
public class If25 {
	
	
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("---------------");
	    System.out.println("select an option:");
	    System.out.println("1) option 1");
	    System.out.println("2) option 2");
	    System.out.println("3) option 3");
	    System.out.println("---------------");
	    
	    int choice = s.nextInt();
	    
	    
	    //your code here
	if(choice==1){
	  
	  System.out.println("user selected "+choice);
	  
	}
	else if (choice ==2){
	  int option2 = s.nextInt();
	  System.out.println("user selected"+ option2);
	  }
	else {
	  System.out.println("user selected "+"3");
	}

	    
	  }
}

