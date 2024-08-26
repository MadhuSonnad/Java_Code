package Pgm_2;

public class MinInArray {
	public static void main(String[] args) {
		int[] arr = { 1,3, 2, 4, 6, 5 };
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}