package day11;

public class Ternary2 {

	public static void main(String[] args) {
		int cost = 105;
		String result;
		
		result = (cost>100 && cost<200)? "moderate":"cheap";
		
		System.out.println("The cost is "+ result);

	}

}
