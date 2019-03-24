package src2;

public class groceries {
	     public static void main(String[] args) {

	     	double cucumber = 2.5d;
	     	double tomatoes = 3d;
	     	double onion = 1.5d;
	     	double pepper = 2d;
	     	double carrot = 4d;


	          System.out.println("1 Cucumber is " + cucumber + " dollars");
	          System.out.println("4 Tomatoes are " + tomatoes*4 + " dollars");
	          System.out.println("2 Onion is " + onion*1.5 + " dollars");
	          System.out.println("1 Pepper is " + pepper + " dollars");
	          System.out.println("6 Carrot is " + carrot*6 + " dollars");

	          double total = cucumber + tomatoes*4 + onion*2 + pepper*2 + carrot * 6; 
	  		System.out.println("Total cost = "+ total + " dollars");
}
}