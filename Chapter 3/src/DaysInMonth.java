	import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		
		heading();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month(Using a number): ");
		int monthInput = input.nextInt();
		
		
		String month = null;
		int days = 0;
		
		if (monthInput == 2) {
			month = "Feburary";
			if(year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0)) {
				days = 29;
			}else {
				days = 28;
			}
		}else {
			switch(monthInput) {
			case 1: month = "January";
					days = 31; break;
			case 3: month = "March";
					days = 31;break;
			case 4: month = "April";
					days = 30;break;
			case 5: month = "May";
					days = 31;break;
			case 6: month = "June";
					days = 30;break;
			case 7: month = "July";
					days = 31;break;
			case 8: month = "August";
					days = 31;break;
			case 9: month = "September";
					days = 30;break;
			case 10: month = "October";
					days = 31;break;
			case 11: month = "November";
					days = 30;break;
			case 12: month = "December";
					days = 31;break;
			}
		}
		
		System.out.println();
		System.out.println(month+" "+year+" has "+days+" days.");
		
		}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|      Days in Month      |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
}
