package help;

import java.util.Random;

public class Ch7_2 
{
	public static void main(String args[])
	{
		Random random = new Random();
	
		int ran1 = random.nextInt(100);
		
		int ran2 = random.nextInt(100);
		
		int ran3 = random.nextInt(100);
		
		System.out.print(ran1 + ", ");
		System.out.print(ran2 + ", ");
		System.out.println(ran3);
		
		 if ((ran1 < ran2) && (ran1 < ran3)) //first if
		 	{
		 		System.out.println(ran1); 
		 		if(ran2 < ran3){ 
		 			System.out.println(ran2);
		 			System.out.println(ran3);		
			} else {
				System.out.println(ran3);
				System.out.println(ran2);	
			}	}
		if ((ran2 < ran3) && (ran2 < ran1))
			{
				System.out.println(ran2);
				if (ran3 < ran1){
					System.out.println(ran3);
					System.out.println(ran1);
			} else {
					System.out.println(ran1);
					System.out.println(ran3);
			}	}
					
		if ((ran3 < ran2) && (ran3 < ran1))
			{
				System.out.println(ran3);
				if (ran2 < ran1){
					System.out.println(ran2);
					System.out.println(ran1);
				} else {
					System.out.println(ran1);
					System.out.println(ran2);
				}	}
	}
}
	
