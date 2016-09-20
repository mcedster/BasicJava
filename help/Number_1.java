package help;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Number_1 
{
	
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		JOptionPane window = new JOptionPane();
		
		
		String first = window.showInputDialog("To display a random integer, first enter the smaller of the two integers");
		
		String second = window.showInputDialog("Now enter the second integer (must be larger than the first number you entered): ");
		
		int first2 = Integer.parseInt(first);
		
		int second2 = Integer.parseInt(second);
		
		int bleh = second2 - first2;
		
		int end =(int)(first2 + (Math.random() * (bleh) + 1));
		
		window.showMessageDialog( null, end);
		
		System.exit(0);
		
		
		/*
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("To display a random integer, first enter the smaller of the two integer: ");
		
		int first = keyboard.nextInt();
		
		System.out.println("Now enter the second integer (must be larger than the first number you entered): ");
		
		int second = keyboard.nextInt();
		
		System.out.println((int)(first + (Math.random() * (second - first) + 1)));
		
		 THis one was hard because i didnt know how to get random stuff, so i had to look it up, still confused on Joptionpanes thoug.
		 */
		
		
		
	}
}
