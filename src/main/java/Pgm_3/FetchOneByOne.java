package Pgm_3;

public class FetchOneByOne {
public static void main(String[] args) {
	int no=12345;
	while(no!=0)
	{
		int rem=no%10;
		no=no/10;
		System.out.print(rem);
		 
	}
}
}
