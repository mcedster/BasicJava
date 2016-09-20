package help;

import java.util.Scanner;

public class Ch7_4 {
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a password to be stored: ");
		System.out.println("The password must not be over 8 characters long and cannot start with a number");
		String pass = keyboard.nextLine();
		
		int passLength = pass.length();
		
		int chars = pass.charAt(0);
		
		if (passLength > 8 || ((chars >= 48) && (chars <= 57))){
			System.out.println("Password does not meet criteria");
		} else 
		System.out.println("Password Created");
		
		
	}
}
