import java.util.Scanner;
public class circleTest {

	public static void main(String[] args) {
		
		       double pi = 3.14;
		       double radius = 5.00;

		       double setPerimeter;
		       System.out.println("the perimeter = "+(setPerimeter =(radius *radius)* pi));

		       Scanner a = new Scanner(System.in);

		       System.out.println("Enter the radius value: ");

		       double rad = a.nextDouble();

		       System.out.println("the new perimeter = "+(setPerimeter =rad*rad* pi));


		       Scanner b = new Scanner(System.in);
		       System.out.println("Enter the second radius value: ");
		       double rad1 = b.nextDouble();
		       System.out.println("the new perimeter = "+(setPerimeter =rad1*rad1* pi));

		       /* my notes on using scanner
		        * Scanner a = new Scanner(System.in);

		       System.out.println("Enter the radius value: ");

		       int rad = a.nextInt();

		       System.out.println("the new perimeter = "+(setPerimeter =rad*rad* pi));

		       */

		   }

		   

	}


