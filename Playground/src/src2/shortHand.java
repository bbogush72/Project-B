package src2;

public class shortHand {

	public static void main(String[] args) {
		
		int i = 10;
		System.out.println("the score is " + i);
		
		i+=5;
		System.out.println("the score is now " + i);
		
		i = i - 2;
		System.out.println("the score is now " + i);
		
		i-=2;
		System.out.println("the score is now " + i);
		
		i=i/2 ; i = i*10;
	
	        System.out.println("the score is "+i);
	        
	        //i = i +5;
	        i +=5;
	        System.out.println("the score is "+ i);
	        //i = i-2;
	        i -=2;
	        System.out.println("the score is "+i);
	        //i= i * 10 ;
	        i *=10;
	        System.out.println("the score is "+i);
	        //i=i/5;
	        i /=5;
	        System.out.println("the score is "+i);
	        //i=i%7 ;
	        i %=7;
	        System.out.println("the score is "+i);
		
	        
	        //increment and decrement
	        
	        i = i+1; // in short i++; or ++i;
	        i = i - 1; // in short i--;
	        System.out.println(i);
	        --i;
	        System.out.println(i);

	}

}
