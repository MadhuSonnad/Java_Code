package Pgm_3;

import java.util.Arrays;

public class ArrayReversePrint {
	public static void main(String[] args) 
	{
		int[] arr = { 1, 3, 2, 0, 4, 6, 5 };
		
		int[] Newarr= new int[arr.length];
		
		for (int i= arr.length-1, j=0;i>=0; i--,j++) 
		{
		Newarr[j]=arr[i];	
		}	
		System.out.println(Arrays.toString(Newarr));
}
}