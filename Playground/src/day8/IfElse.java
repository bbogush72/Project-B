package day8;

public class IfElse {

	public static void main(String[] args) {

		// use it & && | || separately
		int x = 10;
		int y = 15;

		if (++x < 10 && ++y > 15) {       x++;     }
		
		else {							  y++;	   }
		
		System.out.println(x + "...." + y);
	}

}
