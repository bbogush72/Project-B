package day16;

public class ComparisonOperatorOnChar {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = 'B';
		char c3 = ' '; // c1>c2>c3
		
		
		System.out.println("c1 "+(int) c1 + "\nc2 "+ (int)c2 + "\nc3 "+ (int)c3);
		
		System.out.println(c1==c2);
		System.out.println(c1!=c2);
		System.out.println(c1>=c2);
		System.out.println(c1<=c2);
		System.out.println(c3>c1);
		System.out.println(c3>c2);
		
		
		long a =10;    //long is a bigger container
		int b =(int)a; //int is a smaller in comparison; down-casting required explicitly

	}

}
