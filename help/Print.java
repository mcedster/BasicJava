package help;

import java.util.Scanner;
import java.util.Random;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Print 
{
	public static void main( String[] args)
	{
		
		Random ran = new Random();
		
		DecimalFormat form = new DecimalFormat("0.00");
		
		BigDecimal radius = new BigDecimal(ran.nextInt(11));
		
		
		BigDecimal pi = new BigDecimal(form.format(Math.PI));
		
		
		BigDecimal two = new BigDecimal("2");
		
		
		BigDecimal other = pi.multiply(two);
		
		
		BigDecimal circum = other.multiply(radius);
		
		
		System.out.println(circum);
	}
}
