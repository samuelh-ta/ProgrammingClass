package chapter4;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		
		heading();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter String #1: ");
		String base = input.next();
		System.out.print("Enter String #2: ");
		String sub = input.next();
		
		if (base.contains(sub)) {
			System.out.println(sub + " is a substring of " + base);
		}

		}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|        Substring        |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
}
