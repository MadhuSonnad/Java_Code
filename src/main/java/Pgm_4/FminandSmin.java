package Pgm_4;

public class FminandSmin {
	public static void main(String[] args) {
		int[] arr = {13,5,4,6,12};
		int fmin=arr[0];
		int smin=arr[1];
		for (int i=0;i<arr.length; i++) 
		{
			if(arr[i]<fmin)
			{
				smin=fmin;
				fmin=arr[i];
			}
			else if(arr[i]<smin) 
			{
				smin=arr[i];
			}
		}
		System.out.println(fmin+" "+smin);
	}
}
