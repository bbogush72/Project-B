package src2;
import java.util.Scanner;
public class speedMeasure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double time = 0;
						
		System.out.println("Enter the speed of the car in mph: ");
		double speed = input.nextDouble();
		
		System.out.println("Enter the desired distance: ");
		double distance = input.nextDouble();
		time = distance/speed;
		
		//System.out.println("Total time to destination: " + distance/speed);
		System.out.println("Total time to destination: "+time+ "hours/minutes");
		
		//close scanner 
		
		input.close();
		
	}

}
