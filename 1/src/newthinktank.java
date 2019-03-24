

	import java.util.*;

	import java.util.stream.IntStream;


	public class newthinktank {
	    
	        
	            

	    public static void main(String[] args) {
	    
	    int numberOfCars, seatsPerCar, totalSeats, totalNumberOfPeople;
	    numberOfCars = 10;
	    seatsPerCar = 8;
	    
	    totalSeats = seatsPerCar * numberOfCars;
	    totalNumberOfPeople = seatsPerCar * numberOfCars;
	    
	    System.out.println("If we all buy a sports utility car that has");
	    System.out.println(seatsPerCar +" seats per car and ");
	    System.out.println(numberOfCars +" Cars, then ");
	    System.out.println("the total number of seats is "+ totalSeats);
	    System.out.println("the total number of people is "+ totalNumberOfPeople);

	    int brokeDownCars = 2;
	    
	    if(brokeDownCars == 2) {
	    	
	    	System.out.println( seatsPerCar + "seats will be lost and ");
	    	System.out.println( numberOfCars + "cars will be unavailable, then ");
	    	System.out.println((numberOfCars - brokeDownCars) * seatsPerCar + " people can travel in the city" );
	    }
	    	
	    }
	    /*int myInt = 11;
		if(myInt <10) {
			
			System.out.println("Yes, it's true!");
		}
		
		else if(myInt >20) {
			System.out.println("No, It's false!");
		}
		
		else if(myInt>10) {
			System.out.println("Yes, it's true true");
	    */
	    }
