package Pgm_2;

import java.util.Arrays;

public class MergreTwoArrays 
{
public static void main(String[] args) 
{
	int[] arr1= {19,2,5,55,20};
	int[] arr2= {10,20,33,4,5,99};
	
	int[] arr3= new int[arr1.length+arr2.length];
	int i=0;
	
	for (int each : arr1) 
	{
	arr3[i++]=each;	
	}
	
	for (int each : arr2) 
	{
	arr3[i++]=each;	
	}
	System.out.println(Arrays.toString(arr3));
}
}
