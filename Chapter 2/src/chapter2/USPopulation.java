package chapter2;

public class USPopulation {

	public static void main(String[] args) {
		
		heading();
		
		int startPop = 329403690;
		int secondPerYear = 365 * 24 * 60 * 60;
		int birthIncreaseYear = secondPerYear / 7;
		int deathPerYear = secondPerYear / 13;
		int immigrantPerYear = secondPerYear / 45;
		int curPop = startPop;
		
		for (int x = 0; x < 5; x++) {
			curPop = curPop + birthIncreaseYear + immigrantPerYear - deathPerYear;
		}
		
		int endPop = curPop;
		
		System.out.println("The population after 5 years is: " + endPop);
		
	}
	
	 static void heading() {
			
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|      US Population      |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }

}
