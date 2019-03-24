import java.util.Scanner;

public class Import_JavaUtilScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a command: Start or Stop");
		String text = input.nextLine();
			
		switch(text) {
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine stopped!");
		    break;
		    
		    default:
		    	System.out.println("command not recognized");
		}
		
		String text1 = input.nextLine();
		switch(text1) {
		case "enter":
			System.out.println("Your request being processed!");
			break;
			
		case "submit":
			System.out.println("System upgrade in progress");
			break;
			
			default:
				System.out.println("request is invalid");
				
			
		}
		
	}

}
