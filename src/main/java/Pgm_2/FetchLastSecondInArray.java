package Pgm_2;

public class FetchLastSecondInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 0, 4, 6, 5 };
		
		for (int i = 0; i < arr.length ; i++) 
		{
			for (int j =i; j < arr.length ; j++) {

				  if (arr[i] < arr[j]) 
				  {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
//		for (int k = 0; k < arr.length; k++) {
//			}
		System.out.println(arr.length-5);
			
		}
}