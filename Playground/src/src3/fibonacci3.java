package src3;

public class fibonacci3 {

	public static void main(String[] args) {

		int fibo1 = 1, fibo2 = 1, fibo3 = fibo1 + fibo2, fibo4 = fibo2 + fibo3, fibo5 = fibo4 + fibo3,
				fibo6 = fibo4 + fibo5, fibo7 = fibo6 + fibo5;

		System.out.println("Term 1= " + fibo1);
		System.out.println("Term 2= " + fibo2);
		System.out.println("Term 3= " + fibo3);
		System.out.println("Term 4= " + fibo4);
		System.out.println("Term 5= " + fibo5);
		System.out.println("Term 6= " + fibo6);
		System.out.println("Term 7= " + fibo7);

		int fibo8 = fibo6 + fibo7, fibo9 = fibo8 + fibo7, fibo10 = fibo9 + fibo8, fibo11 = fibo10 + fibo9,
				fibo12 = fibo11 + fibo10;

		System.out.println("Term 8= " + fibo8);
		System.out.println("Term 9= " + fibo9);
		System.out.println("Term 10= " + fibo10);
		System.out.println("Term 11= " + fibo11);
		System.out.println("Term 12= " + fibo12);

	}

}
