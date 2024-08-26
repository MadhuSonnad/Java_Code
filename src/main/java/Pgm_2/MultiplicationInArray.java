package Pgm_2;

public class MultiplicationInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 0, 4, 6, 5 };
		
		for (int i = 0; i < arr.length ; i++) {
			for (int j = i+1; j < arr.length ; j++) {

				  if (arr[i] < arr[j]) 
				  {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		int mul=1;
		for (int k = 0; k < arr.length; k++) 
		{
			mul=mul*arr[k];
		}
		System.out.println(mul);
	}
}
