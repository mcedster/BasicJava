package help;

import java.util.Scanner;

public class Number_3 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the word you wish to be translated to Pig Latin?: ");
		
		String word = keyboard.nextLine();
		
		String lower = word.toLowerCase();
		
		String please = lower.trim();
		
		String firstLetter = please.substring(0 , 1);
	
		String restOfWord = please.substring(1,please.length());
		
		String end= "ay";
		
		String total = restOfWord.concat(firstLetter) + end;
		
		System.out.println(total.toLowerCase());
	
		/*
		 DOMS WAY
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the word you wish to be translated to Pig Latin?: ");
		
		String word = keyboard.nextLine();
		
		String lower = word.toLowerCase().trim();
		
		String total = lower.substring(1,lower.length()) + lower.substring(0 , 1) + "ay";
		
		System.out.println(total);    
		 */

	}
}
