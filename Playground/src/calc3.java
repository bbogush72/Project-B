import java.util.Scanner;
public class calc3 {

    public static void main(String[] args) {
      nextInt();

       Scanner in = new Scanner(System.in);
       int a,b,c ;

       System.out.println("Enter the number: \n");

       a = in.nextInt();

       System.out.println("Enter the 2nd number: \n");

       b = in.nextInt();

       System.out.println("Choose the operation " + "\n1.Addition"
       + "\n2.Subtraction"+
               "\n3.Multiplication "+
               "\n4.Division" +
               "\n5.Power" +
               "\n#Please enter the number of operation \n");

       int something = in.nextInt();
       int addition = 1;
       int subtraction = 2;
       int multiplication = 3;
       int division = 4;
       int power = 5;

       if (something == addition) {
           c= a + b;
                   System.out.println(a+ " + " + b + " = " + c); }

       else if (something == subtraction) {
           c = a - b;
           System.out.println(a+ " - " + b + " = " + c); }

           else if (something == multiplication) {
           c= a*b;
           System.out.println(a + "*" + b + "=" + c);}

       else if (something == division) {
           c = a / b;
           System.out.println(a + "/" + b + "=" + c );}

       else if (something == power) {
           System.out.println(" Enhance A or B?" +
                   "\n1.A" +
                   "\n2.B");
           int enhance = in.nextInt();
           int first = 1;
           int second = 2;
           if (enhance == first) {
               System.out.println(Math.pow(a, 2));}
           else if (enhance == second); {
               System.out.println(Math.pow(b, 2));
           }

       }

       }

	private static void nextInt() {
		// TODO Auto-generated method stub
		
	}

	
    }