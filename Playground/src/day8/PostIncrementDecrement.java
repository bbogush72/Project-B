package day8;

public class PostIncrementDecrement {

	public static void main(String[] args) {
		// ++ -- 
		//shortcut
//		int a = 1;
//		a=a+5; //a+=5;
//		a=a-5; //a-=5;
		
		// b-- post - decrement
		// --b pre - decrement
		
		int score = 10;
		System.out.println(score ++); 	//10
		System.out.println(score);		//11
		
		System.out.println(++ score); 	//12
		
		System.out.println(score --);	 // 12
		System.out.println(-- score); 	// 10
		
		int result = score++;
		
		System.out.println("result is "+ result); //10
		
		//current value
		//step 1: current score = 10 goes to if score shows up again
		//step 2: score is still 11 score++ ready to be 12 next time it shows up
		//step 3: score is now 12. ++score 13
		score = score++ + ++score; 
		System.out.println("score is " +score); //11 plus 13
		
		
		

	}

}
