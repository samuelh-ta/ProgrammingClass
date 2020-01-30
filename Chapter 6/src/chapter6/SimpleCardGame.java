package chapter6;

import javax.swing.JOptionPane;

public class SimpleCardGame {

	public static void main(String[] args) {
		
		heading();
		
		game();
		

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
	    
	    static void game() {

	    	for (int x = 1; x < 5; x++) {
	    	// Red card is higher of 2
	    	// Black card is lower
	    	
	    	//tie
	    	//One holding red card wins
	    	
	    	//another tie
	    	//One with diamonds or spades wins
	    	
	    	int[] cardArray = createCards();
	    	
	    	int pValue = cardArray[0];
	    	int pSuit = cardArray[1];
	    	int cValue = cardArray[2];
	    	int cSuit = cardArray[3];
	    	}
	    }
	    
	    static void firstLevel(int pValue,int pSuit,int cValue,int cSuit) {
	    	
	    	if (cSuit == 1 || cSuit == 2) {
	    		
	    	}else if(cSuit == 3 || cSuit == 4) {
	    		
	    	}
	    	
	    }
	    
	    static int[] createCards() {
	    	
	    	int[] returnArray = new int[4];
	    	
	    	int valueInput = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a value 1 - 13: ","Input Value",JOptionPane.QUESTION_MESSAGE));
	    	int suitInput = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a suit 1 - 4: ","Input Suit",JOptionPane.QUESTION_MESSAGE));
	    	
	    	int comValue = (int)(Math.random()*((13-1)+1))+1;
	    	int comSuit = (int)(Math.random()*((4-1)+1))+1;
	    	
	    	returnArray[0] = valueInput;
	    	returnArray[1] = suitInput;
	    	returnArray[2] = comValue;
	    	returnArray[3] = comSuit;

	    	return returnArray; 
	    }
	    
}
