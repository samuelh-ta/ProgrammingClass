package chapter4;

import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {
		
		heading();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your full name(Only First, 1 Middle, and Last): ");
		String fullName = input.next().trim();
		
		int space1 = fullName.indexOf(' ',0);
		int space2 = fullName.indexOf(' ',space1 );
		
		String firstName = fullName.substring(0,space1);
		String middleName = fullName.substring(space1 + 1, space2);
		String lastName = fullName.substring(space2 + 1);
		
		char firstInit = firstName.charAt(0);
		char middleInit = middleName.charAt(0);
		char lastInit = lastName.charAt(0);
		
		
		System.out.println("Your initials area: " + firstInit + ". " + middleInit + ". " + lastInit + ".");
		
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
