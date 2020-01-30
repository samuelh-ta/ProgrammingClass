import javax.swing.JOptionPane;

public class Palindrome {

	public static void main(String[] args) {
		
		heading();
		String input = JOptionPane.showInputDialog(null,"Enter a three digit whole number: ","Input",JOptionPane.QUESTION_MESSAGE);
		int num = Integer.parseInt(input);
		int temp = num;
		int reverse = 0;
		int remainder = 0;
		if (num < 100 || num > 999) {
			JOptionPane.showMessageDialog(null, "That isn't a three digit whole number","Output",JOptionPane.PLAIN_MESSAGE);
		}else {
			
			while (temp > 0) {
				remainder = temp % 10;
				reverse = (reverse * 10) + remainder;
				temp = temp/10;
			}
			
			if (num == reverse) {
				JOptionPane.showMessageDialog(null, num + " is a palindrom whole number","Output",JOptionPane.PLAIN_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null,num+"is not a palindrom whole number","Output",JOptionPane.PLAIN_MESSAGE);
			}
			
		}
	}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|       Palindrome        |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
}
