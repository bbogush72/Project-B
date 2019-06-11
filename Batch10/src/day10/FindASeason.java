package day10;

public class FindASeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*1. Find a season 
		  month -> number and find the season of the year
		  for that moth number.
		  2. Leap Year:
		  
		  if an year is 1) multiple of 400 or 2) multiple of 4 but not multiple of 100 then it s a leap year.
		 */
		
		
		int month= 3; // use scanner for this
		
		//spring -> 3-5
		//summer -> 6-8
		//fall -> 9-11
		// winter -> 12 or 1-2
		// else reject with error message
		
		if (month == 12 || month == 1 || month == 2) {
			
			System.out.println("Winter");
			
		}else if (month>=3 && month <=5) {
			
			System.out.println("Spring");
			
		} else if (month >=6 && month <=8) {
			
			System.out.println("Summer");
			
		} else if (month >=9 && month <=11) {
			
			System.out.println("Fall");
			
		}else {
			System.out.println("invalid month. 1-12 accepted");
			
			
		}
	}

}
