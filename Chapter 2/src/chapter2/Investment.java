package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Investment {

	public static void main(String[] args) {
		
		heading();
		
		Scanner scanobject = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####.00");
		
		System.out.println();
		System.out.print("Enter an investment amount: ");
		double investAmt = scanobject.nextDouble();
		System.out.print("Enter an annual interest rate: ");
		double annualInterestRate = scanobject.nextDouble();
		System.out.print("Enter an amount of years: ");
		int years = scanobject.nextInt();
		
		//To convert it into an actual percentage
		double annualInterestRateDiv100 = annualInterestRate / 100;
		double monthInterestRate = annualInterestRateDiv100 / 12;
		
		double futureInvestmentVal = investAmt * Math.pow(1 + monthInterestRate,years * 12);
		
		System.out.println();
		System.out.println("Princial:               $" + df.format(investAmt));
		System.out.println("Rate:                   " + annualInterestRate + "%");
		System.out.println("Years:                  " + years);
		System.out.println("Compound Interest is:   $" + df.format(futureInvestmentVal));
		}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|       Investment        |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
}
