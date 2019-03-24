package day11;
import java.util.Scanner;
public class Nums {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers:");
		
		int TwoNums = in.nextInt();
		int TwoNums2 = in.nextInt();
		System.out.println(TwoNums+"\n"+TwoNums2);
		if((TwoNums==TwoNums2)){
			
			System.out.println(TwoNums+ " and "+TwoNums2 +" are equal");
		}
		else if (TwoNums>TwoNums2) {
			System.out.println(TwoNums+ " is greater than " + TwoNums2);
		}
		
		else if(TwoNums2>TwoNums) {
			System.out.println(TwoNums2+ " is greater than "+TwoNums);
		}
	}

}
