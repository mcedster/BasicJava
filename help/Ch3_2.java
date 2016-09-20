package help;

import java.util.Scanner;

public class Ch3_2 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Calculating the body mass index.");
		System.out.print("Enter the weight in pounds: ");
		
		double weight = keyboard.nextDouble();
		
		System.out.println("Enter height in inches: ");
		
		double height = keyboard.nextDouble();
		
		double kilo = weight / 2.2;
		
		double meters = height * 0.0254;
		
		System.out.println("The weight is " + weight + "pound(s) or " + kilo + "kilogram(s).");
		System.out.println("The height is " + height + "pound(s) or " + meters + "meter(s)");
		System.out.println("The body mass index is " + kilo/(meters * meters));
	}
}
