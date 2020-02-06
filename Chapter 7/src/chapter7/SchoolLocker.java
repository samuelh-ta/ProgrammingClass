package chapter7;

public class SchoolLocker {
	
	public static void main(String[] args) {
		
		heading();
		
		boolean[] lockerArray = createLockerArray();
		lockerArray = runStudents(lockerArray);
		printOpenLockers(lockerArray);

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
	
	static boolean[] createLockerArray() {
		
		boolean[] lockerArray = new boolean[100];
		
		for (int x = 0; x < 100; x++) {
			lockerArray[x] = false;
		}
		
		return lockerArray;
		
	}
	
	static boolean[] runStudents(boolean[] lockerArray) {
		
		for (int student = 0; student < 100; student++) {
			for (int locker = 0; locker < 100; locker ++) {
				if(student == 0) {
					lockerArray[locker] = true;
				}else if (locker % student == 0) {
					if(lockerArray[locker] == true) {
						lockerArray[locker] = false;
					} else if (lockerArray[locker] == false) {
						lockerArray[locker] = true;
					}
				}
			}
		}
		
		return lockerArray;
		
	}
	
	static void printOpenLockers(boolean[] lockerArray) {
		
		for (int x = 0; x < 100; x++) {
			if (lockerArray[x] == true) {
				System.out.println((x + 1) + " ");
			}
		}
	}

}
