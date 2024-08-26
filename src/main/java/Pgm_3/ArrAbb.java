package Pgm_3;

public class ArrAbb {

	public static void main(String[] args) {
		int[][] arr= {{10,20,30},{40,50,60},{60,70,80,90}};
		int[][] abb= {{10,20,30},{40,50,60},{60,70,80,90}};
		
		for (int i = 0; i < abb.length; i++) 
		{
		for (int j = 0; j < abb.length; j++) 
		{
		System.out.print(arr[i][j]+arr[i][j]+" ");	
		}	
		System.out.println();
		}

	}

}
