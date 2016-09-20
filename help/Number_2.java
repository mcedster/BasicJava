package help;

import java.util.Scanner;
import java.math.BigDecimal;

public class Number_2
{
	public static void main( String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first BigDecimal: ");
		
		BigDecimal first = new BigDecimal(keyboard.nextDouble());
		
		System.out.println("Enter your second BigDecimal: ");
		
		BigDecimal second = new BigDecimal(keyboard.nextDouble());
		
		System.out.print(first + " + " + second + " = " );
		System.out.println(first.add(second));
		
		System.out.print(first + " - " + second + " = ");
		System.out.println(first.subtract(second));
		
		System.out.print(first +  " * " + second + " = ");
		System.out.println(first.multiply(second));
		
		System.out.print(first + " / " + second + " = ");
		System.out.println(first.divide(second));
		
		System.out.print(first + ".toString() is ");
		System.out.println(first.toString());
		
		System.out.print(second + ".toString() is ");
		System.out.println(second.toString());
		
		System.out.print(first + ".equals(" + second + ") is ");
		System.out.println(first.equals(second));
		
		System.out.print(first + ".compareTo(" + second + ") is ");
		System.out.println(first.compareTo(second));
		
	}
}
