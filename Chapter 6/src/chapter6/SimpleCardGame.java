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
	    	
	    	int pWon = 0;
	    	int cWon = 0;
	    	int tie = 0;
	    	
	    	for (int x = 1; x <= 5; x++) {
	    	
	    	int[] cardArray = createCards();
	    	
	    	int pValue = cardArray[0];
	    	int pSuit = cardArray[1];
	    	int cValue = cardArray[2];
	    	int cSuit = cardArray[3];
	    	
	    	JOptionPane.showMessageDialog(null,"The computer picked a " + cValue + getSuit(cSuit) + " and you picked a " + pValue + getSuit(pSuit),"Output",JOptionPane.PLAIN_MESSAGE);
	    	
	    	
	    	if (isTie(pValue,pSuit,cValue,cSuit)) {
	    		tie += 1;
	    		JOptionPane.showMessageDialog(null,"You tied this round","Output",JOptionPane.PLAIN_MESSAGE);
	    	}else if (firstLevel(pValue,pSuit,cValue,cSuit)) {
	    		pWon += 1;
	    		JOptionPane.showMessageDialog(null,"You won this round","Output",JOptionPane.PLAIN_MESSAGE);
	    	}else {
	    		cWon += 1;
	    		JOptionPane.showMessageDialog(null,"You lost this round","Output",JOptionPane.PLAIN_MESSAGE);
	    	}
	    	
	    	}
	    	
	    	JOptionPane.showMessageDialog(null,"Score: You: " + pWon + " Com: " + cWon + " Tie: " + tie,"Output",JOptionPane.PLAIN_MESSAGE);
	    }
	    
	    static boolean firstLevel(int pValue,int pSuit,int cValue,int cSuit) {
	    	boolean playerWon = false;
	    	boolean needSecondLevel = false;
	    	
	    	if (cSuit == 1 || cSuit == 2) {
	    		if (pValue > cValue) {
	    			playerWon = true;
	    		}else if (cValue > pValue) {
	    			playerWon = false;
	    		}else {
	    			needSecondLevel = true;
	    			secondLevel(pValue,pSuit,pValue,cSuit);
	    		}
	    	}else if(cSuit == 3 || cSuit == 4) {
	    		if(pValue < cValue) {
	    			playerWon = true;
	    		}else if (cValue < pValue) {
	    			playerWon = false;
	    		}else {
	    			needSecondLevel = true;
	    			secondLevel(pValue,pSuit,pValue,cSuit);
	    		}
	    	}
	    	
	    	if (needSecondLevel) {
	    		if (secondLevel(pValue,pSuit,pValue,cSuit) == true) {
	    			playerWon = true;
	    		}else {
	    			playerWon = false;
	    		}
	    	}
	    	
	    	return playerWon;
	    }
	    
	    static boolean secondLevel(int pValue,int pSuit,int cValue,int cSuit) {
	    	boolean playerWon = false;
	    	boolean pRed = (pSuit == 1 || pSuit == 2);
	    	boolean cRed = (cSuit == 1 || cSuit == 2);
	    	
	    	if (pRed && cRed) {
	    		thirdLevel(pValue,pSuit,pValue,cSuit);
	    	}else if (pRed) {
	    		playerWon = true;
	    	}else if (cRed) {
	    		playerWon = false;
	    	}
	    			
	    			
	    	return playerWon;
	    }
	    
	    static boolean thirdLevel(int pValue,int pSuit,int cValue,int cSuit) {
	    	boolean playerWon = false;

	    	if (pSuit == 2 || pSuit == 3) {
	    		playerWon = true;
	    	}else if(cSuit == 2 || cSuit == 3) {
	    		playerWon = false;
	    	}
	    	
	    	
	    	return playerWon;
	    }
	    
	    static boolean isTie(int pValue,int pSuit,int cValue,int cSuit) {
	    	boolean isTie = false;
	    	
	    	boolean pRed = (pSuit == 1 || pSuit == 2);
	    	boolean pDiaSpade = (pSuit == 2 || pSuit == 3);
	    	boolean cRed = (cSuit == 1 || cSuit == 2);
	    	boolean cDiaSpade = (cSuit == 2 || cSuit == 3);
	    	boolean sameValue = (pValue == cValue);
	    			
	    	if (pRed && pDiaSpade && cRed && cDiaSpade && sameValue) {
	    		isTie = true;
	    	}
	    	
	    	return isTie;
	    }
	    
	    static String getSuit(int suit) {
	    	
	    	String output = "";
	    	if (suit == 1) {
	    		output = "\u2665";
	    	}else if (suit == 2) {
	    		output = "\u2663";
	    	}else if (suit == 3) {
	    		output = "\u2660";
	    	}else if (suit == 4) {
	    		output = "\u2666";
	    	}
	    	
	    	return output;
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
