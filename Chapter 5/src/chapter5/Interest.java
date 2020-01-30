package chapter5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		
		heading();
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.00");
		
		System.out.print("Loan Amount:                $");
		int loanAmt = input.nextInt();
		System.out.print("Number of Years:            ");
		int numOfYrs = input.nextInt();
		System.out.print("Annual Interest Rate:       ");
		double annInterestRate = input.nextDouble();
		
		double monthlyInterestRate = (annInterestRate / 100.0 / 12.0);
		double monthlyPay = loanAmt * monthlyInterestRate/(1-(Math.pow(1/(1+monthlyInterestRate), (numOfYrs*12))));
		
		System.out.println("Montly Payment:             $" + df.format(monthlyPay));
		
		System.out.println("Payment#: \tInterest: \tPrincipal: \tBalance: ");		

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
