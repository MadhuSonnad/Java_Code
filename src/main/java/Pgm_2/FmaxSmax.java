package Pgm_2;

public class FmaxSmax {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 6, 5 };
		int fmax=0;
		int smax=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>fmax)
			{
				smax=fmax;
				fmax=arr[i];
			}
			else if(arr[i]>smax) 
			{
				smax=arr[i];
			}
		}
		System.out.println(fmax+" "+smax);
	}
}