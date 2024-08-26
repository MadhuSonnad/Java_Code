package Pgm_4;

public class FminSmin {
	public static void main(String[] args) {
		int[] arr = {13,5,4,6,12};
		int fmin=arr[0];
		int smin=arr[1];
		for (int i=1;i<arr.length; i++) 
		{
			if(arr[i]>fmin)
			{
				smin=fmin;
				fmin=arr[i];
			}
			else if(arr[i]>smin) 
			{
				smin=arr[i];
			}
		}
		System.out.println(fmin+" "+smin);
	}
}
