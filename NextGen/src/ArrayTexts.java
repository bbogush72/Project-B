
public class ArrayTexts {

	public static void main(String[] args) {
		
		String[][] texts = new String[][] {
			{ "Hello there", "Welcome"},
			{ "Help", "wanted", "needed"},
			{"Jump", "specialist", "retail"}
			
	
};

			System.out.println(texts[0][0]);
			System.out.println(texts[0][1]);
			System.out.println(texts[1][0]);
			System.out.println(texts[1][1]);
			System.out.println(texts[1][2]);
			System.out.println(texts[2][0]);
			System.out.println(texts[2][1]);
			System.out.println(texts[2][2]);
			
			for(int row=0; row<texts.length; row++) {
				for(int col=0; col < texts[row].length; col++) {
					
			
			System.out.print(texts[row][col] + "\t");

				}
			}
	}
}


		
			
