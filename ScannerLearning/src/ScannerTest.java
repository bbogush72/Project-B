import java.util.Scanner;
public class ScannerTest {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("Please enter a command: In or out or numbers 1 or 2");
		String text = input.nextLine();
			
		switch(text) {
		case "in":
			System.out.println("You earned a bonus point");
			break;
			
		case "out":
			System.out.println("No bonus point on this one!");
		    break;
		case "1":
			System.out.println("1 minute to burn out!");
		    break;
		case "2":
			System.out.println("2 minutes to burnout!");
		    break;
		    
		    default:
		    	System.out.println("command not recognized");
	}

		System.out.println("Please enter a command:10 or 15");
		String text1 = input.nextLine();
			
		switch(text1) {
		case "10":
			System.out.println("10 minutes to processing!");
		    break;
		case "15":
			System.out.println("15 minutes to burnout!");
		    break;
		    
		    default:
		    	System.out.println("not recognized");
		}
	}
}
