package help;

import java.util.Scanner;

public class Ch7_6 {
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a letter grade to calculate your GPA: " );
		String first,second,third,fourth;
			first = keyboard.nextLine();
		System.out.println("Please enter another letter grade to calculate your GPA:");
			second = keyboard.nextLine();
		System.out.println("Please enter another letter grade to calculate your GPA:");
			third = keyboard.nextLine();
		System.out.println("Please enter the last letter grade to calculate your GPA");
			fourth = keyboard.nextLine();
	
		first = first.toLowerCase();
		second = second.toLowerCase();
		third = third.toLowerCase();
		fourth = fourth.toLowerCase();
			
		double a = 4.0;
		double b = 3.0;
		double c = 2.0;
		double d = 1.0;
		double f = 0.0;
	
		// if ()
		//fuck this shit
		
		
	
		//if ((first || second || third || fourth))
	}

}
