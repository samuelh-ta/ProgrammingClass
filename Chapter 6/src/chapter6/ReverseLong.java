package chapter6;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class ReverseLong {

	public static void main(String[] args) {
		
		heading();
		
		output(reverse(input()));

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
	    
	    static long input() {    	
	    	Scanner input = new Scanner(System.in);
	    	
	    	System.out.print("Enter a int: ");
	    	
	    	return input.nextLong();
	    }
	    
	    static long reverse(long input) {
	    	
	    	long reversedLong = 0;
	    	
	    	long base = input;
	    	
	    	while(base != 0) {
	    		long digit = base % 10;
	    		reversedLong = reversedLong * 10 + digit;
	    		base /= 10;
	    	}
	    	
	    	return reversedLong;
	    }
	    
	    static void output(long reversedLong) {
	    	System.out.println("The reversed int is: " + reversedLong);
	    }
}
