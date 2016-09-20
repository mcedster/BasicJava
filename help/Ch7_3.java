package help;

import java.util.Scanner;

public class Ch7_3 {
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter 'password123' to continue: ");
		String pass = keyboard.nextLine();
		
		String real = "password123";
				
		int test = pass.compareTo(real);
		
		if (test == 0){
			System.out.println("Access Granted");
		} else
			System.out.println("Access Denied");
			
	}

}
