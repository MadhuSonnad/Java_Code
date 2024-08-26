package Pgm_3;

public class SwapingInteger {

	public static void main(String[] args) 
	{
	int a=10;
	int b=20;
	int c= 0;
	
	c=a;
	a=b;
	b=c;
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("==================");
	
	int a1=10;
	int b1=20;
	a1=a1+b1;
	b1=a1-b1;
	a1=a1-b1;
	System.out.println(a1);
	System.out.println(b1);
	

	}

}
