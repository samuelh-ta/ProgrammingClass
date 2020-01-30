package chapter5;

import java.util.Scanner;

public class Calander {

	public static void main(String[] args) {
		
		heading();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Year: ");
		int year = input.nextInt();
		System.out.print("Enter the first day of that year (1 for Saturday): ");
		int startDay = input.nextInt();
		
		int nextWeekDay = getNextWeekDay(startDay);
		
		String month = "January";
		int monthInt = 1;
		
		int page = 1;
		
		String blank = "";
		
		blank = input.nextLine();
		
		System.out.println();
		
		while (page < 7) {
			for (int x = 1; x <= 2; x++) {
				
				month = getMonthString(monthInt);
				System.out.println("          " + month + "     " + year);
				
				System.out.println("---------------------------------------");
				System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
				System.out.println(firstWeek(startDay));
				
				int secondWeekStart = getNextWeekDay(startDay);
				int daysInMonth = getDaysInMonth(monthInt,year);
				int currentDay = secondWeekStart;
				
				int y = 0;
				
				while (currentDay <= daysInMonth) {
					for (y = 1; y <= 7 ;y++) {
						if (currentDay <= daysInMonth) {
							if (currentDay < 10) {
								System.out.print("  " + currentDay + "   ");
							}else {
								System.out.print(" " + currentDay + "   ");
							}
						}else {
							startDay = y; break;
						}
						currentDay++;
					}
					if (y == 8) {
						startDay = 1;
					}
					System.out.println();
				}
				System.out.println();
				monthInt++;
			}
			if (page !=6) {
			System.out.println("Press Enter for the next 2 months");
			blank = input.nextLine();
			}
			page++;	
		}
		
		}
	
		static String getMonthString(int monthInt) {
			
			String month;
			
			switch (monthInt) {
			case 1: month = "January"; break; 
			case 2: month = "February"; break; 
			case 3: month = "March"; break; 
			case 4: month = "April"; break; 
			case 5: month = "May"; break; 
			case 6: month = "June"; break; 
			case 7: month = "July"; break; 
			case 8: month = "August"; break; 
			case 9: month = "September"; break; 
			case 10: month = "October"; break; 
			case 11: month = "November"; break; 
			case 12: month = "December"; break; 
			default: month = "monthInt either went to far or to little: ";
					 System.out.println(month + monthInt);break;
			}
			
			return month;
		}
		
		static String firstWeek(int startDay) {
			
			String firstWeek = "";
			
			 switch (startDay) {
			 
			 case 1: firstWeek = "  1     2     3     4     5     6     7"; break;
			 
			 case 2: firstWeek = "        1     2     3     4     5     6"; break;
			 
			 case 3: firstWeek = "              1     2     3     4     5"; break;
			 
			 case 4: firstWeek = "                    1     2     3     4"; break;
			 
			 case 5: firstWeek = "                          1     2     3"; break;
			 
			 case 6: firstWeek = "                                1     2"; break;
			 
			 case 7: firstWeek = "                                      1"; break;
			 
			 }
			 
			 return firstWeek;
			
		}
		
		static int getNextWeekDay(int firstDay) {
			
			int nextWeekDay = 0;
			
			switch (firstDay) {
			
			case 1: nextWeekDay = 8;break;
			
			case 2: nextWeekDay = 7;break;
			
			case 3: nextWeekDay = 6;break;
			
			case 4: nextWeekDay = 5;break;
			
			case 5: nextWeekDay = 4;break;
			
			case 6: nextWeekDay = 3;break;
			
			case 7: nextWeekDay = 2;break;
			
			}
			
			return nextWeekDay;
			
		}
		
		static int getDaysInMonth(int monthInt, int year) {
			
			int daysInMonth = 0;
			
			switch(monthInt) {
			case 1: daysInMonth = 31;
			case 3: daysInMonth = 31;
			case 5: daysInMonth = 31;
			case 7: daysInMonth = 31;
			case 8: daysInMonth = 31;
			case 10: daysInMonth = 31;
			case 12: daysInMonth = 31;break;
			case 4: daysInMonth = 30;
			case 6: daysInMonth = 30;
			case 9: daysInMonth = 30;
			case 11: daysInMonth = 30;break;
			case 2: 
			
				if (year % 4 == 0) {
				daysInMonth = 29;
			}else {
				daysInMonth = 28;
			}break;
		
			}
			
			return daysInMonth;
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
