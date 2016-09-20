package help;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Bleh
{
	public static void main( String args[])
	{
		JOptionPane window = new JOptionPane();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the year to find out if it is a leap year or not: ");
		int year = keyboard.nextInt();
				
		int year3 = year / 100;
		
		if ((year%4 == 0 && !(year3 % 100 ==0 )) || (year % 400 == 0)) {
			
			System.out.println("Yes, " + year + " is a leap year");	
		
		} else {
			
			System.out.println("No, " + year  + " is not a leap year");
		
		}
	
		/* it must be
		divisible by 4 and not divisable by 100
		or divisible by 400 */
	}
}
