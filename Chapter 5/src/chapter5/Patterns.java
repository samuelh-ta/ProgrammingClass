package chapter5;


public class Patterns {

	public static void main(String[] args) {
		
		heading();
		
		pattern1();
		System.out.println();
		
		pattern2();
		System.out.println();
		
		pattern3();
		System.out.println();
		
		pattern4();
		
		}

		static void pattern1() {
			
			String s = "";
			
			System.out.println("Pattern 1:");
			
			for (int x = 1; x <= 6; x++) {
				s += x + " ";
				System.out.println(s);
			}
			
		}
		
		static void pattern2() {
			
			System.out.println("Pattern 2:");
			
			for (int x = 6; x >= 1; x--) {
				for (int y = 1; y <= x; y++) {
					System.out.print(y + " ");
				}
				System.out.println();
			}
			
		}
		
		static void pattern3() {
			
			System.out.println("Pattern 3:");
			
			String space = "";
			String numLine = "";
			
			int max = 5;
			
			for (int x = 1; x <= 6; x ++) {
				
				for (int y = max; y >= 1; y--) {
					space += "  ";
				}
				
				for (int y = 0; y <= 5;y++) {
					int minusLine = x - y;
					
					numLine += minusLine + " ";
					
					if (minusLine == 1) {
						break;
					}
				}
				
				System.out.println(space + numLine);
				space = "";
				numLine = "";
				max--;
			}
		}
		
		static void pattern4() {
			
			System.out.println("Pattern 4:");
			
			String b = "1 2 3 4 5 6";
			String a = "";
			
			int y = 1;
			
			System.out.println(b);
			
			for(int x = 6; x >= 1; x--) {				
				
				for (int j = 1; j <= y; j++) {
					a += "  ";	
				}
				
				b = b.substring(0, x * 2 - 2);
				
				System.out.println(a + b);
			
				b.equals("");
				a = "";
				y ++;
			}
				
			
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
