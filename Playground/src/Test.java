import java.util.Scanner;

public class Test {

    public static void main(String[] args)
    {
        final double CONCENTRATION = 5;

	// write your code here
        double weightLoss = 4;
        double calories = 10.00;
        double ratioWeightLoss = 0.0;

        double startingWeightDieter = 65.0;
        double desireWeightDieter = 50.0;

        

        // First find the proportion of the weight loss
        ratioWeightLoss = (startingWeightDieter/desireWeightDieter);
        // Person lose weight at desired weight/concentration * ratio

         int exercise = (int) ((desireWeightDieter/CONCENTRATION) * ratioWeightLoss);

        //Display output
        System.out.println("The person can safely exercise up to " + exercise + " minutes 3 times  a day to reach the goal.");
        
        //add your weight to see how much you must exercise
        Scanner keyboard = new Scanner(System.in);
        double workout = (desireWeightDieter/CONCENTRATION) * ratioWeightLoss;
        System.out.print("Enter the weight information in lbs: ");
        double lbs = keyboard.nextInt();
        
        weightLoss = calories/weightLoss;
        lbs = (startingWeightDieter%desireWeightDieter) * CONCENTRATION;
        
        System.out.println(lbs + " days of exercise can get you " + workout + " pounds weight loss ");
        
    }
}