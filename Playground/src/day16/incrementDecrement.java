package day16;

public class incrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10; 
		a = a++     + a   +   a--     -a --     +    ++a;
		//   10     + 11  +   11   -   10        +    10;
		
		
		
		System.out.println("value of a is: "+ a);
	}

}
