package Pgm_3;

public class MergrIndoubleArray {
	public static void main(String[] args) {
		int[][] arr= {{10,20,30},{40,50,60},{60,70,80,90}};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");	
			}
		}
		
		System.out.println("*****");
		
		int[][] arr1= {{10,20,30},{40,50,60},{60,70,80,90}};
		for (int i = arr1.length-1;i>=0; i--) 
		{
			for (int j = arr1.length-1;j>=0; j--) {
				System.out.print(arr[i][j]+" ");	
			}
		}
}
}