package chapter7;

import java.util.Scanner;

public class Hangman {
	
	public Scanner input;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		heading();

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
