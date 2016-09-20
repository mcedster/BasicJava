package help;

import java.util.Scanner;		
		
public class Number_6 
{
	public static void main( String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a phrase to be encoded: ");
		String phrase = keyboard.nextLine();
		
		phrase = phrase.replace('a', '@').replace('A', '@');
		
		phrase = phrase.replace('e', '#').replace('E', '#');
		
		phrase = phrase.replace('i', '!').replace('I', '!');
	
		phrase = phrase.replace('o', '&').replace('O', '&');
		
		phrase = phrase.replace('u', '%').replace('U', '%');
		
		System.out.println(phrase);
		
	}
}
