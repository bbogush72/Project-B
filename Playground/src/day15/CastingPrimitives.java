package day15;

public class CastingPrimitives {

	public static void main(String[] args) {
		// char boolean
		//byte short int long float double
		
		//type conversion ==> casting
		//byte ==> int //upcasting/type widening
		//following process implicitly happens by compiler
		byte b = 12;
		int i = b;
		
		int y =(int)b; // (int) is not required but to show here explicitly
		
		//int to byte ==> downcasting / type narrowing
		
		int a = 20;
		byte c = (byte)a;
		
		double d = 12.2;
		int k = (int)d;
		
		char c1 = 'A';
		int cNum =c1;
		System.out.println(cNum);
		
		
		

	}

}
