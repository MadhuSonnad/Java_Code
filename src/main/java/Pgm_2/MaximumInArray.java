package Pgm_2;

public class MaximumInArray {
public static void main(String[] args) {
	int[] arr = { 1, 3, 2, 0, 4, 6, 5 };
	int max = 0;
	for (int i = 0; i < arr.length; i++)
	{
	if(arr[i]>max)
	{
		max=arr[i];
	}
	}
	System.out.println(max);
}
}
