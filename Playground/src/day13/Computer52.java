package day13;
import java.util.Scanner;
public class Computer52 {

	public static void main(String[] args) {
		System.out.println("Select screen size:");

		Scanner scan = new Scanner(System.in);
		double price = 0;
		
		
		double screenSize = scan.nextDouble();

		if (screenSize == 13.3) {

			price = price + 200;

		} else if (screenSize == 15.0) {

			price = price + 300;

		} else if (screenSize == 17.3) {

			price = price + 400;

		}

		System.out.println("Select CPU type:");

		String cpu = scan.next();

		switch (cpu) {

		case "i3":

			price = price + 150;

			break;

		case "i5":

			price = price + 250;

			break;

		case "i7":

			price = price + 350;

			break;

		}

		System.out.println("Select RAM size:");

		int ram = scan.nextInt();

		price = price + (ram / 4) * 50;

		System.out.println("Select storage type:");

		String storageType = scan.next();

		System.out.println("Enter memory size:");

		int memorySize = scan.nextInt();

		if (storageType == "HDD") {

			price = price + (memorySize / 500) * 50;

		} else if (storageType == "SSD") {

			price = price + (memorySize / 500) * 100;

		}

		System.out.println("Enter screen resolution:");

		String screenResolution = scan.next();

		if (screenResolution == "FULLHD") {

			price = price + 100;

		} else if (screenResolution == "4K") {

			price = price + 200;

		}

		System.out.println("Laptop price is: " + price);

	}

}
