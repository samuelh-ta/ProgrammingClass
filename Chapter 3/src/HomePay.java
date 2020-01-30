import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class HomePay {

	public static void main(String[] args) {
		
		heading();
		
		DecimalFormat df = new DecimalFormat("###.00");
		
		String name = JOptionPane.showInputDialog(null,"Enter your name: ","NameInput",JOptionPane.QUESTION_MESSAGE);
		String hoursWorked = JOptionPane.showInputDialog(null,"Enter hours worked: ","HoursWorkedInput",JOptionPane.QUESTION_MESSAGE);
		String hourlyPay = JOptionPane.showInputDialog(null,"Enter your hourly pay: ","HourlyPayInput",JOptionPane.QUESTION_MESSAGE);
		double dbleHoursWorked = Double.parseDouble(hoursWorked);
		double dbleHourlyPay = Double.parseDouble(hourlyPay);
		double extraHours;
		
		if (dbleHoursWorked > 40) {
			extraHours = dbleHoursWorked - 40;
			dbleHoursWorked -= extraHours;
		}else {
			extraHours = 0;
		}
		
		double grossPay = dbleHourlyPay * dbleHoursWorked + (dbleHourlyPay * 1.5 * extraHours);
		
		double healthDeduct = 56.50;
		double socDeduct = grossPay * .075;
		double retireDeduct = grossPay * .08;
		
		double takeHomePay = grossPay - healthDeduct - socDeduct - retireDeduct;
		
		JOptionPane.showMessageDialog(null, name+"'s Pay Summary:\nGross Pay:  $"+df.format(grossPay)+"\nDeductions:\n	          Health:        $"+df.format(healthDeduct)+"\n		         Soc. Sec      $"+df.format(socDeduct)+"\n         Retire.           $"+df.format(retireDeduct)+"\n------------------------------------------\nTake Home Pay: $"+df.format(takeHomePay),"Output", JOptionPane.PLAIN_MESSAGE);
		
		}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|        Home Pay         |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
}
