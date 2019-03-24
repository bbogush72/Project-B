import java.util.*;

public class HateAndLove {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
	String hate = "hate";
	String love = "love";
	String input;
	String inputChanged;
	int hateIndex;
	
			System.out.println("Please enter the text phrase with word" );
			input = keyboard.nextLine();
			
			if ((input.indexOf(hate) == -1)){
			System.out.println( "no change");
			}
			else {
				hateIndex = input.indexOf(hate);
				inputChanged = input.substring(0, hateIndex) + "love" + input.substring(hateIndex+4);
				
				System.out.println("bare necessity, changing your life: " + input + "\n +" +
				"check this out: " + inputChanged);
				
			}
	}

}
