package Pgm_3;

public class PrintEvenAndOddNmumberInArray {
public static void main(String[] args) {
	int[] arr= {1,23,4,5,6,7,8};
	int count=0;
	for (int i = 0; i < arr.length; i++) 
	{
		if(arr[i]%2==0)
		{
			count++;
			System.out.println(arr[i]+"="+count);
		}
	}
	System.out.println("Sepration");
	
	int[] arr1= {1,23,4,5,6,7,8};
	int count1=0;
	for (int i = 0; i < arr.length; i++) 
	{
		if(arr[i]%2==1)
		{
			count1++;
			System.out.println(arr[i]+"="+count1);
		}
	}
}
}
