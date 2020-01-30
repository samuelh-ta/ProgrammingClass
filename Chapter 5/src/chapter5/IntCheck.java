package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IntCheck {

	public static void main(String[] args) {
		
		heading();
	
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.00");
		
		boolean isZero = false;
		
		double numAmt = 0;
		double negAmt = 0;
		double posAmt = 0;
		double totalAmt = 0;
		double posTotalAmt = 0;
		double negTotalAmt = 0;
		float avgAmt = 0F;
		float posAvgAmt = 0F;
		float negAvgAmt = 0F;
		
		System.out.println("Enter one integer at a time and enter 0 when you're done.");
		
		while (!isZero) {
	
			System.out.print("Enter an integer: ");
			int x = input.nextInt();
			
			if (x != 0) {
				
				numAmt += 1;
				totalAmt += x;
				
				if (x > 0) {
				
					posAmt += 1;
					posTotalAmt += x;
					
				}else if (x < 0) {
					
					negAmt += 1;
					negTotalAmt += x;
					
				}
			}else {
				
				isZero = true;
			}
				
		}
		
		avgAmt = (float) (totalAmt / numAmt);
		posAvgAmt = (float) (posTotalAmt / posAmt);
		negAvgAmt = (float) (negTotalAmt / negAmt);
		
		System.out.println("posAmt: " + posAmt);
		System.out.println("negAmt: " + negAmt);
		System.out.println("totalAmt: " + totalAmt);
		System.out.println("avgAmt: " + df.format(avgAmt));
		System.out.println("posAvgAmt: " + df.format(posAvgAmt));
		System.out.println("negAvgAmt: " + df.format(negAvgAmt));

		}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|       Heading MK2       |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
}
