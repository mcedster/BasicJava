package help;

import java.util.Scanner;

public class Ch3_1 
{
	public static void main( String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the initial temperature of the pot roast in degrees Fahrenheit? ");
		double temp = keyboard.nextDouble();
		
		System.out.println("What is the weight of the pot roast?");
		double weight = keyboard.nextDouble();
		
		double celsius = (temp - 32) * (5 / 9);

		System.out.println(weight * (71.1111 - celsius) * 4184);
		
	}
}
