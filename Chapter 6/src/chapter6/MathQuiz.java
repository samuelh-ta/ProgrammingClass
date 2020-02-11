package chapter6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathQuiz {
	
	public static Scanner input;
	
	public static DecimalFormat df = new DecimalFormat("###.00");
	
	public static int firstTry;
	public static int secondTry;
	public static int thirdTry;
	public static int wrong;
	
	public static double firstPercent;
	public static double secondPercent;
	public static double thirdPercent;
	public static double wrongPercent;
	
	public static int currentTry;
	public static int triesTaken;

	public static void main(String[] args) {
		
		heading();
		
		int firstTry = 0;
    	int secondTry = 0;
    	int thirdTry = 0;
    	int wrong = 0;
    	
    	int currentTry = 1;
    	int triesTaken = 0;
		
		input = new Scanner(System.in);
		
		runTest();

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
	    
	    public static void runTest() {
	    	
	    	int equation = inputEquation();
	    	int amount = inputAmount();
	    	
	    	switch (equation) {
	    		
	    	case 1: addition(amount);break;
	    	
	    	case 2: subtraction(amount);break;
	    	
	    	case 3: multiplication(amount);break;
	    	
	    	case 4: division(amount);break;
	    	
	    	case 5: mix(amount);break;
	    		
	    	default: mix(amount * 2);
	    			System.out.println("You didn't enter a correct equation int so you get 2 times the amount in a mix!");break;
	    	}
	    	
	    }
	    
	    public static int inputEquation() {
	    	System.out.println("MATH QUIZ!");
	    	System.out.println("	1. Addition");
	    	System.out.println("	2. Subtraction");
	    	System.out.println("	3. Multiplication");
	    	System.out.println("	4. Division");
	    	System.out.println("	5. Mix");
	    	System.out.print("Enter the operation: ");
	    	
	    	return input.nextInt();
	    }
	    
	    public static int inputAmount() {
	    	
	    	System.out.println();
	    	System.out.print("Enter the amount of questions: ");
	    	
	    	return input.nextInt();
	    }
	    
	    public static void addition(int amount) {
	    	
	    	int addend1 = 0;
	    	int addend2 = 0;
	    	int solution = 0;
	    	
	    	for (int x = 1; x <= amount; x++) {
	    		
	    		triesTaken = 0;
	    		currentTry = 1;
	    		
	    		addend1 = (int)(Math.random()*((20-1)+1))+1;
	    		addend2 = (int)(Math.random()*((20-1)+1))+1;
	    		solution = addend1 + addend2;
	    		
	    		System.out.println(addend1 + " + " + addend2 + " = ?");
	    		System.out.print("The answer is: ");
	    		
	    		while (currentTry <= 3) {
	    			if (input.nextInt() == solution) {
	    				triesTaken = currentTry;
	    				currentTry = 5;
	    			}else if (currentTry == 3){
	    				System.out.println("That answer is wrong.");
	    				System.out.println();
	    				currentTry++;
	    			}else {
	    				System.out.println("That answer is wrong.");
	    				System.out.println();
	    				currentTry++;
	    				System.out.println(addend1 + " + " + addend2 + " = ?");
	    	    		System.out.print("The answer is: ");
	    			}
	    		}
	    		
	    		switch (triesTaken){
	    		case 1: firstTry++; break;
	    		case 2: secondTry++;break;
	    		case 3: thirdTry++;break;
	    		default: wrong++; break; 
	    		}
	    			
	    	}
	    	
	    	
	    	
	    	output(amount,firstPercent,firstTry,secondPercent,secondTry,thirdPercent,thirdTry,wrongPercent,wrong);
   	
	    }
	    
	    public static void subtraction(int amount) {
	    	
	    	int minuend = 0;
	    	int subtrahend = 0;
	    	int solution = 0;
	    	
	    	for (int x = 1; x <= amount; x++) {
	    		
	    		triesTaken = 0;
	    		currentTry = 1;
	    		
	    		minuend = (int)(Math.random()*((20-1)+1))+1;
	    		subtrahend = (int)(Math.random()*((20-1)+1))+1;
	    		solution = minuend - subtrahend;
	    		
	    		System.out.println(minuend + " - " + subtrahend + " = ?");
	    		System.out.print("The answer is: ");
	    		
	    		while (currentTry <= 3) {
	    			if (input.nextInt() == solution) {
	    				triesTaken = currentTry;
	    				currentTry = 5;
	    			}else if (currentTry == 3){
	    				System.out.println("That answer is wrong.");
	    				System.out.println();
	    				currentTry++;
	    			}else {
	    				System.out.println("That answer is wrong.");
	    				System.out.println();
	    				currentTry++;
	    				System.out.println(minuend + " - " + subtrahend + " = ?");
	    	    		System.out.print("The answer is: ");
	    			}
	    		}
	    		
	    		switch (triesTaken){
	    		case 1: firstTry++; break;
	    		case 2: secondTry++;break;
	    		case 3: thirdTry++;break;
	    		default: wrong++; break; 
	    		}
	    			
	    	}
	    	
	    	
	    	
	    	output(amount,firstPercent,firstTry,secondPercent,secondTry,thirdPercent,thirdTry,wrongPercent,wrong);
   	
	    	
	    }
	    
	    public static void multiplication(int amount) {
	    	int factor1 = 0;
	    	int factor2 = 0;
	    	int solution = 0;
	    	
	    	for (int x = 1; x <= amount; x++) {
	    		
	    		triesTaken = 0;
	    		currentTry = 1;
	    		
	    		factor1 = (int)(Math.random()*((20-1)+1))+1;
	    		factor2 = (int)(Math.random()*((20-1)+1))+1;
	    		solution = factor1 * factor2;
	    		
	    		System.out.println(factor1 + " * " + factor2 + " = ?");
	    		System.out.print("The answer is: ");
	    		
	    		while (currentTry <= 3) {
	    			if (input.nextInt() == solution) {
	    				triesTaken = currentTry;
	    				currentTry = 5;
	    			}else if (currentTry == 3){
	    				System.out.println("That answer is wrong.");
	    				System.out.println();
	    				currentTry++;
	    			}else {
	    				System.out.println("That answer is wrong.");
	    				System.out.println();
	    				currentTry++;
	    				System.out.println(factor1 + " * " + factor2 + " = ?");
	    	    		System.out.print("The answer is: ");
	    			}
	    		}
	    		
	    		switch (triesTaken){
	    		case 1: firstTry++; break;
	    		case 2: secondTry++;break;
	    		case 3: thirdTry++;break;
	    		default: wrong++; break; 
	    		}
	    			
	    	}
	    	
	    	
	    	
	    	output(amount,firstPercent,firstTry,secondPercent,secondTry,thirdPercent,thirdTry,wrongPercent,wrong);
   	
	    }
	    
	    public static void division(int amount) {
	    	
	    	int dividend = 0;
	    	int divisor = 0;
	    	double solution = 0;
	    	
	    	for (int x = 1; x <= amount; x++) {
	    		
	    		triesTaken = 0;
	    		currentTry = 1;
	    		
	    		dividend = (int)(Math.random()*((20-1)+1))+1;
	    		divisor = (int)(Math.random()*((20-1)+1))+1;
	    		solution = Double.parseDouble(df.format(dividend / divisor));
	    		
	    		
	    		System.out.println(dividend + " / " + divisor + " = ?");
	    		System.out.print("The answer is: ");
	    		
	    		while (currentTry <= 3) {
	    			if (input.nextInt() == solution) {
	    				triesTaken = currentTry;
	    				currentTry = 5;
	    			}else if (currentTry == 3){
	    				System.out.println("That answer is wrong.");
	    				System.out.println();
	    				currentTry++;
	    			}else {
	    				System.out.println("That answer is wrong.");
	    				System.out.println();
	    				currentTry++;
	    				System.out.println(dividend + " / " + divisor + " = ?");
	    	    		System.out.print("The answer is: ");
	    			}
	    		}
	    		
	    		switch (triesTaken){
	    		case 1: firstTry++; break;
	    		case 2: secondTry++;break;
	    		case 3: thirdTry++;break;
	    		default: wrong++; break; 
	    		}
	    			
	    	}
	    	
	    	
	    	
	    	output(amount,firstPercent,firstTry,secondPercent,secondTry,thirdPercent,thirdTry,wrongPercent,wrong);
   	
	    	
	    }
	    
	    public static void mix(int amount) {
	    	
	    	int addend1 = 0;
	    	int addend2 = 0;
	    	int minuend = 0;
	    	int subtrahend = 0;
	    	int factor1 = 0;
	    	int factor2 = 0;
	    	int dividend = 0;
	    	int divisor = 0;
	    	int solution = 0;
	    	double solutionDiv = 0;
	    	
	    	int rNum = (int)(Math.random()*(4-1)+1)+1;
	    	
	    	for (int x = 1; x <= amount; x++) {
	    		
	    		rNum = (int)(Math.random()*(4-1)+1)+1;
	    		triesTaken = 0;
	    		currentTry = 1;
	    		
	    		switch (rNum) {
	    		case 1:
	    			addend1 = (int)(Math.random()*((20-1)+1))+1;
		    		addend2 = (int)(Math.random()*((20-1)+1))+1;
		    		solution = addend1 + addend2;
		    		
		    		System.out.println(addend1 + " + " + addend2 + " = ?");
		    		System.out.print("The answer is: ");
		    		
		    		while (currentTry <= 3) {
		    			if (input.nextInt() == solution) {
		    				triesTaken = currentTry;
		    				currentTry = 5;
		    			}else if (currentTry == 3){
		    				System.out.println("That answer is wrong.");
		    				System.out.println();
		    				currentTry++;
		    			}else {
		    				System.out.println("That answer is wrong.");
		    				System.out.println();
		    				currentTry++;
		    				System.out.println(addend1 + " + " + addend2 + " = ?");
		    	    		System.out.print("The answer is: ");
		    			}
		    		}
		    		
		    		switch (triesTaken){
		    		case 1: firstTry++; break;
		    		case 2: secondTry++;break;
		    		case 3: thirdTry++;break;
		    		default: wrong++; break; 
		    		} break;
		    		
	    		case 2: 
	    			minuend = (int)(Math.random()*((20-1)+1))+1;
		    		subtrahend = (int)(Math.random()*((20-1)+1))+1;
		    		solution = minuend - subtrahend;
		    		
		    		System.out.println(minuend + " - " + subtrahend + " = ?");
		    		System.out.print("The answer is: ");
		    		
		    		while (currentTry <= 3) {
		    			if (input.nextInt() == solution) {
		    				triesTaken = currentTry;
		    				currentTry = 5;
		    			}else if (currentTry == 3){
		    				System.out.println("That answer is wrong.");
		    				System.out.println();
		    				currentTry++;
		    			}else {
		    				System.out.println("That answer is wrong.");
		    				System.out.println();
		    				currentTry++;
		    				System.out.println(minuend + " - " + subtrahend + " = ?");
		    	    		System.out.print("The answer is: ");
		    			}
		    		}
		    		
		    		switch (triesTaken){
		    		case 1: firstTry++; break;
		    		case 2: secondTry++;break;
		    		case 3: thirdTry++;break;
		    		default: wrong++; break; 
		    		}break;
		    		
	    		case 3:
	    			factor1 = (int)(Math.random()*((20-1)+1))+1;
		    		factor2 = (int)(Math.random()*((20-1)+1))+1;
		    		solution = factor1 * factor2;
		    		
		    		System.out.println(factor1 + " * " + factor2 + " = ?");
		    		System.out.print("The answer is: ");
		    		
		    		while (currentTry <= 3) {
		    			if (input.nextInt() == solution) {
		    				triesTaken = currentTry;
		    				currentTry = 5;
		    			}else if (currentTry == 3){
		    				System.out.println("That answer is wrong.");
		    				System.out.println();
		    				currentTry++;
		    			}else {
		    				System.out.println("That answer is wrong.");
		    				System.out.println();
		    				currentTry++;
		    				System.out.println(factor1 + " * " + factor2 + " = ?");
		    	    		System.out.print("The answer is: ");
		    			}
		    		}
		    		
		    		switch (triesTaken){
		    		case 1: firstTry++; break;
		    		case 2: secondTry++;break;
		    		case 3: thirdTry++;break;
		    		default: wrong++; break; 
		    		} break;

	    		case 4:

		    		dividend = (int)(Math.random()*((20-1)+1))+1;
		    		divisor = (int)(Math.random()*((20-1)+1))+1;
		    		solutionDiv = Double.parseDouble(df.format(dividend / divisor));
		    		
		    		
		    		System.out.println(dividend + " / " + divisor + " = ?");
		    		System.out.print("The answer is: ");
		    		
		    		while (currentTry <= 3) {
		    			if (input.nextInt() == solutionDiv) {
		    				triesTaken = currentTry;
		    				currentTry = 5;
		    			}else if (currentTry == 3){
		    				System.out.println("That answer is wrong.");
		    				System.out.println();
		    				currentTry++;
		    			}else {
		    				System.out.println("That answer is wrong.");
		    				System.out.println();
		    				currentTry++;
		    				System.out.println(dividend + " / " + divisor + " = ?");
		    	    		System.out.print("The answer is: ");
		    			}
		    		}
		    		
		    		switch (triesTaken){
		    		case 1: firstTry++; break;
		    		case 2: secondTry++;break;
		    		case 3: thirdTry++;break;
		    		default: wrong++; break; 
		    		}break;
	    		}
	    	}
	    	
	    	output(amount,firstPercent,firstTry,secondPercent,secondTry,thirdPercent,thirdTry,wrongPercent,wrong);
	    	
	    }
	    
	    public static void output(int amount, double firstPercent, int firstTry, double secondPercent, int secondTry, double thirdPercent,int thirdTry, double wrongPercent, int wrong) {
	    	if (!(firstTry == 0)) {
	    		firstPercent = firstTry / amount * 100;
	    	}
	    	
	    	if (!(secondTry == 0)) {
	    		secondPercent = secondTry / amount * 100;
	    	}
	    	
	    	if (!(thirdTry == 0)) {
	    		thirdPercent = thirdTry / amount * 100;
	    	}

	    	if (!(wrong == 0)) {
	    		wrongPercent = wrong / amount * 100;
	    	}
	    	
	    	System.out.println("You got: ");
	    	System.out.println("\t" + firstPercent + "% on the first try");
	    	System.out.println("\t" + secondPercent + "% on the second try");
	    	System.out.println("\t" + thirdPercent + "% on the third try");
	    	System.out.println("\t" + wrongPercent + "% wrong"); 
	    }
}
