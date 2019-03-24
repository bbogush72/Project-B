package src3;

public class fibonacci2 {
	public static long fibonacci2(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci2(n - 1) + fibonacci2(n - 2);
	}

	public static void main(String[] args) {
		int n = 60;
		for (int i = 1; i <= n; i++)
			System.out.println(i + ": " + fibonacci2(i));
	}

}
