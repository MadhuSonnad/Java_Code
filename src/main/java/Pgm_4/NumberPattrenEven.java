package Pgm_4;

public class NumberPattrenEven {
public static void main(String[] args) {
	int n=9;
	 int k=0;
	for (int i = 1; i <=n; i++, k+=2) 
	{
		for (int j = 1; j <=n; j++) //for (int j = 1; j <=i; j++) l pattren 
		{
			System.out.print(k +" ");
		}
		System.out.println();
	}
}
}