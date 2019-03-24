package day15;

public class StringReplace {

	public static void main(String[] args) {

		String x = "Sunday is Java Day";
		// x.replace("ll", "yy");

		// System.out.println(x);

		// System.out.println(x.replace("ll", "yy"));

		String y = x.toUpperCase();

		System.out.println(y);

		// String z = x.(s)
		System.out.println(x.contains("Java"));

		// System.out.println(substring(7,8));
		System.out.println("" + x.substring(7, 9));

		int a = x.length();
		int b = a - 1;
		char c = x.charAt(b);
		
		System.out.println(c);
	}

}
