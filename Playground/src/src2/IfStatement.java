package src2;
import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Are you hungry:");
        boolean isHungry = input.nextBoolean();
        if(isHungry == true)
        {
        System.out.println("Go eat dinner");
        }
        else
        {
        System.out.println("Let's continue coding");
	}

	}

}
