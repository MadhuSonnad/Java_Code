package Pgm_1;

public class ArrayMaxLength {
public static void main(String[] args) {
	String [] arr= {"max2","max33","maxw44","4mxmaxdh"};
	String maxlength = arr[0];
	for (int i = 0; i < arr.length; i++) 
	{
	if (arr[i].length()>maxlength.length())
	{
		maxlength=arr[i];
	}
	}
	
	{
	System.out.println(maxlength);	
	}
}
}
