package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Wind_Chill {

	public static void main(String[] args) {
		
		heading();
		
		Scanner scanobject = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.00");
		
		System.out.println();
		System.out.print("Enter the temperature outside: ");
		double tempOutside = scanobject.nextDouble();
		System.out.print("Enter the wind speed: ");
		double windSpeed = scanobject.nextDouble();
		
		double windVelocity = Math.pow(windSpeed, 0.16);
		double windChillIndex = 35.74 + (0.6215 * tempOutside) - (35.75 * windVelocity) + (0.4275 * tempOutside * windVelocity);
		
		System.out.println("The wind chill index is: " + df.format(windChillIndex));

	}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|       Wind Chill        |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
}
