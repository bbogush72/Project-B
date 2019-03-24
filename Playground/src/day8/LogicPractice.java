package day8;

public class LogicPractice {

	public static void main(String[] args) {
		int score = 10;
		boolean result1 = score >4;
		boolean result2 = score >4 && score <11;
		
		boolean result3 = score>14 && score <11; //10>14 false AND STOP, DO NOT CHECK THE SECOND ONE
		boolean result4 = score>14 || score <11; // 10>14 OR 10<11 both false, if 1 was true, then it can be true.
		
		//boolean result5 = score++>10 && score<12; //10>10 && 11<12 false
		//boolean result5 = ++score>10 && score<12; //11>10 && 11<12 true
		//boolean result5 = score++>10 || score<12; //10>10 || 11<12 true
		//boolean result5 = score++>10 && ++score<12; //score 11, it doesn't evaluate the second operand --> ++score<12;
		//boolean result5 = score++>10 & ++score<12; score 12, it will evaluate the second operand ---> ++score<12
		boolean result5 = score>10 & ++score<13; // false
		boolean result6 = score>9 || score<1; // true
		
		boolean result7 = !true && true;
		boolean result8 = score>5 && 6>5;
		
		System.out.println("The value of score now : " + score+"\n"); 
		
		System.out.println("the result 1 is " +result1);
		System.out.println("the result 2 is " +result2);
		System.out.println("the result 3 is " +result3);
		System.out.println("the result 4 is " +result4);
		System.out.println("the result 5 is " +result5);
		System.out.println("the result 6 is " +result6);
		System.out.println("the result 7 is " +result7);
		
		System.out.println( true && false ||true );
		System.out.println( true || false && true );
		
		System.out.println(score>10 || (score ==10 && score>5));
	}

}
