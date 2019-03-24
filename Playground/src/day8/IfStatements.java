package day8;

public class IfStatements {

	public static void main(String[] args) {
		String weather = "nice";
		if (weather.contentEquals("nice")){
			
			System.out.println("goHiking");
					
		}
		
		else if (weather.equals("snowy")) {
			System.out.println("go snow boarding");
		}
		
		else {
			System.out.println("stay home and watch some tv");
		}
	}

}
