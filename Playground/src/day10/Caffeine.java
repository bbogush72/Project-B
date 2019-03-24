package day10;
import java.util.Scanner;
public class Caffeine {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter number of milligrams in drink: ");
		
		double milliCaffeine = in.nextDouble();
		int count =(int) (10000/milliCaffeine);
		
		
		
		System.out.println("it would take about " + count + " drinks for a lethal overdose");
	
	
	}

}
