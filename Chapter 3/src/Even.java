import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		
		heading();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		boolean outputBol = num % 2 == 0;
		System.out.println("Is " + num +" even? " + outputBol);
		
		}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|          Even           |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
}
