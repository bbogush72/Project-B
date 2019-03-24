package day11;

public class TernaryCondition {

	public static void main(String[] args) {
		int n1 = 15, n2 = 10;
		
		int max = (n1>n2) ? n1:n2;
		max = (n1<n2) ? n1:n2;
		System.out.println("The value of max is "+max);
		
		
		
		String action;
		boolean isGreen=true;
		
		action =(isGreen)? "Can drive!" : "Can't drive!";
		
		System.out.println(action);
		
		//another example if else if replacement; ternary
		
		int bill = 1000;
		int discount = (bill>2000) ? 15 : 10;
		
		System.out.println("The discount value is "+discount);
		
		
		//another example with nested ternary conditional statement
		
		int bills = 2000;
		int qty = 10;
		discount = (bill>1000)? (qty>11)? 10: 9: 5;
		
		System.out.println("the nested discount is "+discount );
		
		
		//another ternary operator
		
		int score = 78;
		String result;
		result =(score>60)? "pass" : "fail";
		System.out.println();
		
		//char type ternary op
		
		double price = 1009;
		String label;
		
		label =(price>1000) ? "tax discount received" : "no tax discount";
		System.out.println(label);
		
		
		//int and string example
		
		int x;
		String quality = "good";
		x = (quality.equals("good"))? 100: 0;
		System.out.println(x);
		
	
				
	}

}
