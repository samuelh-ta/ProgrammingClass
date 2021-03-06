package chapter5;


public class PyramidPattern {

	public static void main(String[] args) {
		
		heading();
		
		pyramid();

		}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|      Large Pyramid      |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
	   static void pyramid() {
	    	
		   int max = 1;
		   int maxPerLine = 1;
		   int startInt = 1;
		   int currentInt = startInt;
		   boolean hasHitMax = false;
		   
		   for (int line = 1; line <= 8; line++) {
			   
			   for (int test = 7; test >= line; test--) {
				   System.out.print("\t");
			   }
			   
			   if (line != 1) {
				   max *= 2;
				   maxPerLine += 2;
			   }
			   
			   for (int x = 1; x <= maxPerLine;x++) {
				   if (x == 1) {
				   currentInt = startInt;
				   System.out.print(currentInt + "\t");
				   }else if(hasHitMax == false) {
				   currentInt *= 2;
				   System.out.print(currentInt + "\t");
				   if(currentInt == max) {
					   hasHitMax = true;
				   }
				   }else if (hasHitMax == true) {
					   currentInt /= 2;
					   System.out.print(currentInt + "\t");
				   } 
			   }
			   hasHitMax = false;
			   System.out.println();
			   
		   }
	 	
	   }
	    
}
