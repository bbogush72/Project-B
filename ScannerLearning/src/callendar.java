
public class callendar {

	public static void main(String[] args) {

		int year = 2019;

		int day = 1;
		String months[] = {
				"January, February, March, April, May, June, July, Agust, September, October, November, December" };

		/*
		 * for(int i = 1; i <= 12 ; i = i + 1) {
		 * System.out.printf("The month of the year 2019 is: %d\n" , i);
		 */
		for (String month : months) {

			System.out.println(month);
		}

		for (int i = 0; i < months.length; i++) { }
		
		System.out.println(months[0]);
	}

}
