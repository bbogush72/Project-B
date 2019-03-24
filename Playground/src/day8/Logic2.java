package day8;

public class Logic2 {

	public static void main(String[] args) {
		boolean isHungry = true;
		boolean isBreakTime = true;
		boolean isYourLunchReady = true;
		
		System.out.println("are you hungry and is it break time? "+ (isHungry && isBreakTime)); //false
		
		System.out.println("are you hungry or is it break time? "+ (isHungry || isBreakTime)); //true
		
		boolean reverseIsHungry = ! isHungry; //negate ishungry this way
		
		System.out.println("are you hungry? "+ reverseIsHungry); 								//false
		
		
		boolean areWeSuperReady = isHungry && isBreakTime && isYourLunchReady;
		System.out.println("Hungry, it's break time and food is ready= " + areWeSuperReady);
		
	    // Logical and operator &&
	      // As long as one operand is false WHOLE THING WILL BE FALSE 
	      // ONLY WHEN both operands are true then WHOLE THING WILL BE TRUE 
	    
	    // Logical or operator ||
	      // As long as one operand is TRUE WHOLE THING WILL BE TRUE 
	      // ONLY WHEN both operands are false then WHOLE THING WILL BE FALSE 
	    
	    // Logical not operator !
		
		
		System.out.println("result of (true && true)  " +  (true && true)  );
	    System.out.println("result of (false && true) " +  (false && true)  );
	    System.out.println("result of (true && false) " +  (true && false)  );
	    System.out.println("result of (false && false) " +  (false && false)  );
	    
	    System.out.println("result of (true || true)  " +  (true || true)  );
	    System.out.println("result of (false || true) " +  (false || true)  );
	    System.out.println("result of (true || false) " +  (true || false)  );
	    System.out.println("result of (false || false) " +  (false || false)  );
	    
	    System.out.println("result of !true " + (!true) );
	    System.out.println("result of !false " + (!false) );
		
	}

}
