
public class arrayofStrings {

	public static void main(String[] args) {

		/* check how this message is green */

		String[] words = new String[6];

		words[0] = "Apple";
		words[1] = "Banana";
		words[2] = "Pear";
		words[3] = "orange";
		words[4] = "Kiwi";

			System.out.println(words[3]);

		String[] fruits = { "apple", "banana", "pear", "orange", "kiwi" };

		for (String fruit : fruits) {

			System.out.println(fruit);
		}
		 int[][] values; values = new int[3] [2];
		 
		 System.out.println("Check out the size of this array:");
		
		 values[0][0] = 10; values[0][1] = 20; values[1][0] = 30; values[1][1] = 40;
		 values[2][0] = 50; values[2][1] = 60;
		 
		 System.out.println(values[0][0]); 
		 System.out.println(values[0][1]);
		 System.out.println(values[1][0]); 
		 System.out.println(values[1][1]);
		 System.out.println(values[2][0]); 
		 System.out.println(values[2][1]);
		 
		 for (int i = 0; i < values.length; i++) { }
		 System.out.println(values.length);
	}

}
