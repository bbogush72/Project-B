
public class hello {

	public static void main(String[] args) {

		System.out.println(" Hellow World");

		byte numberOfTheLetter = -128; //1 byte \range -128 to 127
		short numberOfTheWord = -30; //2bytes\ -32 to 32
		int numberOfTheValue = 1500000; //4bytespower neg 9 pos 9
		long numberOfThe = 180000000000L;
		double veryBigNumber = 5000000000000000000.00d; //8bytes
		float PriceOf = 49.99f;
		
		System.out.println(numberOfThe);
		System.out.println(numberOfThe+numberOfTheLetter + 
				(numberOfTheWord* numberOfTheValue) - numberOfThe +
				veryBigNumber*PriceOf);
		
		char Single = 'A';
		char Single1 = ' ';
		char Single3 = '1';
		
		boolean love = false; 
		System.out.println("if " +love);
		
		
		double ask1 = 6.99;
		double ask2 = 6.29;
		double ask= ask1 + ask2;
		System.out.println("the result of addition: " + ask);
		
		String sentence = "the result of addition: ";
		String outfinal = sentence + ask;
		System.out.println(outfinal);
		
		double outfinal1 = ask1 - ask2;
		System.out.println(outfinal1);
		
		String sentence1 = " subtraction of ask1 and ask2 equals ";
		String outfinal2 = sentence1 + outfinal1;
		System.out.println(outfinal2);
		
	}
}
