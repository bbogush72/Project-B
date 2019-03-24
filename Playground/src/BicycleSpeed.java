import java.util.Scanner;
import java.lang.System;

public class BicycleSpeed {
	/**
	 *  Bicyclists can calculate their speed if the gear size and cadence is known. Gear size
	 *  refers to the effective diameter of the wheel. Gear size multiplied by pi (3.14) gives
	 *  the distance travelled with one turn of the pedals. Cadence refers to the number of
	 *  pedal revolutions per minute (rpm). The speed in miles per hour is calculated by
	 *  the following:
	 *
	 *  Speed(mph) = Gear Size(inches) * pi * 1(ft)/12(inches) * 1(mile)/5280(ft) * Cadence(rpm) * 60(minutes)/(hour)
	 *
	 *  This is a program that calculates the speed for a gear size of 100 inches and a
	 *  cadence of 90 rpm. This would be considered a high cadence and a maximum gear
	 *  size for a typical bicycle. In writing your program, don’t forget that the expression
	 *  1/12 will result in 0, because both 1 and 12 are integers, and when the integer
	 *  division is performed, the fractional part is discarded.
	 *
	 * */

	
	    public static void main(String[] args)
	    {
	    	Scanner keyboard = new Scanner (System.in);
	        final double PI = 3.14;

		// write your code here
	        double speed = 0.0; // mph
	        double gearSize = 100.00; //inches
	        int cadence = 90; //rpm - pedalling rate per min

	        speed = gearSize * PI * (1.0/12.0) * (1.0/5280.0) * cadence * 60.0;
	        
	        
	        String input;
	         
	        System.out.println("Speed: " + speed);
	        
	        
	        System.out.println("Please enter the cadence rate" );
			input = keyboard.nextLine();
			double speed1 = keyboard.nextDouble();
			
			Scanner b = new Scanner(System.in);	
			double speed11 = b.nextDouble();
						 
 double value = 0;
System.out.println(speed11 = + gearSize * PI * (1.0/12.0) * (1.0/5280.0) * value * 60.0);

/*
	Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the radius value: ");
		
		int rad = a.nextInt();
		
		System.out.println("the new perimeter = "+(setPerimeter =rad*rad* pi));
		
		
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the second radius value: ");
		int rad1 = b.nextInt();
		System.out.println("the new perimeter = "+(setPerimeter =rad1*rad1* pi));

 */
	    }
	}

