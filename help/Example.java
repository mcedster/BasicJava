package help;

import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Example 
{
	public static void main( String[] args )
	{
			DecimalFormat format = new DecimalFormat("0.00");
			
			JOptionPane window = new JOptionPane();
			
			String height = window.showInputDialog("What is the height of the cone? ");
			
			String coneRad = window.showInputDialog("What is the radius of the cone?");
			
			String scoops = window.showInputDialog("How many scoops of ice cream are on top of the cone? ");
			
			double height2 = Double.parseDouble(height); 
	
			double coneRadius = Double.parseDouble(coneRad);
			
			double scoops2 = Double.parseDouble(scoops);
			
			final double PI = Math.PI;
			
			double volume = PI * (coneRadius * coneRadius) * (height2 / 3.0);
			
			double sphere = (4/3 * PI * (coneRadius * coneRadius * coneRadius)) * scoops2;
			
			double total = volume + sphere;
		
			window.showMessageDialog(null, "The volume of the cone is: " + format.format(total));
			
			/*
			ANSWER TO NUMBER 4 BELOW, NUMBER 5 IS ABOVE 
		
			DecimalFormat format = new DecimalFormat("0.00");
			
			JOptionPane window = new JOptionPane();
			
			String height = window.showInputDialog("What is the height of the cone? ");
			
			String coneRad = window.showInputDialog("What is the radius of the cone?");
			
			double height2 = Double.parseDouble(height); 
	
			double coneRadius = Double.parseDouble(coneRad);
			
			final double PI = Math.PI;
			
			double volume = PI * (coneRadius * coneRadius) * (height2 / 3.0);
		
			window.showMessageDialog(null, "The volume of the cone is: " + format.format(volume) );
			 */
	}
}


