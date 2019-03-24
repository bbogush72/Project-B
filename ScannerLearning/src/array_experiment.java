public class array_experiment {

	public static void main(String[] args) {
		/*
		 * int[][] values; values = new int[3] [2];
		 * 
		 * System.out.println("Check out the size of this array:");
		 * 
		 * 
		 * 
		 * values[0][0] = 10; values[0][1] = 20; values[1][0] = 30; values[1][1] = 40;
		 * values[2][0] = 50; values[2][1] = 60;
		 * 
		 * 
		 * System.out.println(values[0][0]); System.out.println(values[0][1]);
		 * System.out.println(values[1][0]); System.out.println(values[1][1]);
		 * System.out.println(values[2][0]); System.out.println(values[2][1]);
		 * 
		 * for (int i = 0; i < values.length; i++) { }
		 */

		String[] words = new String[3];

		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";

		System.out.println(words[0]);

		String[] fruits = { "apple", "banana", "pear", "kiwi" };

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		int value = 0;
		String text = null;
		
		System.out.println(text);
		
		String[] texts = new String[2] ;
		System.out.println(texts [0]);
		
		texts[0] = "one";
		
	}

}
