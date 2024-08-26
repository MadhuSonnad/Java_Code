package Pgm_4;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int fact=1;
		int no=5; 
		for (int i = 1; i <= no; i++) 
		{
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println("*******");

		int fact1=1;
		//int no1=5;
		for (int i = 5; i >= 1; i--) 
		{
			fact1=fact1*i;
			System.out.println(fact1);
		}	
	}
}
