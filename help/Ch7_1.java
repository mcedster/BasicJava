 package help;

import java.util.Scanner;

public class Ch7_1 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a month in the form of an integer (1-12): ");
		
		int month = keyboard.nextInt();
		
		System.out.print("Enter a day from  1-31: ");
		
		int day = keyboard.nextInt();
		//i am so sorry for this
		if ((month == 12 && (day >= 22 && day <= 31) || (month >=1  && month <=2) && (day >=1 && day <=31)) || (month ==3 && (day>=1 && day<=19))) 
		{
			System.out.println("The season is Winter ");
		} else if ((month == 3 && (day >=1 && day <= 20)) || ((month >= 4 && month <=5) && (day >= 1 && day <= 31)) || (month ==6 && (day >=1 && day<=20))) 
		{
			System.out.println("The season is Spring");
		} else if ((month >= 6 && month <= 9) && (day >= 21 && day <=31) || ((month >= 6 && month <= 9) && (day <=20 && day >= 1))) 
		{ 
			System.out.println("The season is Summer");
		} else if ((month >= 9 && month <=12) && (day >= 1 && day <= 31))
		{
			System.out.println("The season is Fall");		
		} else 
			System.out.println("Bad");
		
		
		/*
		 if (month > 12 || month < 1 || day > 31 || day < 1)
		{
			System.out.print("Bad");
			System.exit(0);
		}
		
		if ((month == 1 || month == 2) || (month == 12 && day > 21) || (month == 3  && day < 20))
			System.out.print("Winter");
		
		else if ((month == 4 || month == 5) || (month == 3 && day > 19) || (month == 6  && day < 21))
			System.out.print("Spring");
		
		else if ((month == 7 || month == 8) || (month == 6 && day > 20) || (month == 9  && day < 21))
			System.out.print("Summer");
		
		else
			System.out.print("Fall");
		 */
	}
}