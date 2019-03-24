package day8;

public class LogicalOperators {

	public static void main(String[] args) {
		//comparison reminder: equality ==
		//inequality !=
		//greater than or equal >=
		//greater than >
		//less than <
		//less than or equal <=
		
	//result of comparison operator is boolean; true or false
		
			
	//type of logical operators; 1-  and operator && 
	//							 2-  or operator || 
		//                       3-  not operator !
		
		int a = 10, b =20, c=10; 
		
		boolean b1 = a>b;
		boolean b2 = a>=c;
		
		System.out.println("a is more than b = "+ b1);
		System.out.println("a is more than or equal to c = "+ b2);
		
		boolean bothMeetRequirement = b1 && b2;
		System.out.println("are both conditions are met = "+ bothMeetRequirement);
		
	}

}
