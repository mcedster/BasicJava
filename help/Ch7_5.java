package help;

import java.util.Scanner;

public class Ch7_5 
{
	public static void main( String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number to find out the grade: ");
		double grade = keyboard.nextDouble();
		
		if ((grade >= 90) && (grade <= 100))
		{
			System.out.println("A");
		} else if ((grade >= 80) && (grade <= 89))
		{
			System.out.println("B");
		} else if ((grade >= 70) && (grade <= 79))
		{
			System.out.println("C");
		} else if ((grade >= 60) && (grade <= 69))
		{
			System.out.println("D");
		} else
		{
			System.out.println("F");
		}
	}

}
