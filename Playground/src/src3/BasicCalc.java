package src3;
import java.util.Scanner;
public class BasicCalc {

		    public static void main(String[] args) {
		   

		       Scanner in = new Scanner(System.in);
		       double a;
			   double b;


		       System.out.println("Enter the first number: \n");

		       a = in.nextDouble();
		       
		       System.out.println("Enter the second number: \n");
		       
		       b= in.nextDouble();
		       
		       System.out.println("Choose a function: 1=division, "
		       						+ "2=multiplication, 3=addition, 4=subtraction \n");

		       double n1 = 1; double n2=2; double n3=3; double n4=4;
		       
		       double something =in.nextDouble();
		       
		       if (something == n1) {
		       System.out.println("Division result is= "+ (n1=a/b));
		       
		       }
		       else if(something == n2) {
		       
		       System.out.println("Multiplication result is= "+ (n2=a*b));
		       }
		     
		       else if(something == n3) {
		       
		       System.out.println("Addition result is= "+(n3=a+b));
		       }
		       
		       else if(something ==n4) {
		      
		       System.out.println("Subtraction result is= "+ (n4=a-b));
		       }
		       
		       
		       }

	}


