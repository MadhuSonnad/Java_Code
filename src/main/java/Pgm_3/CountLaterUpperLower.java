package Pgm_3;

public class CountLaterUpperLower {
public static void main(String[] args) {
	String s="MADHU Sonnad";
	int count = 0;
	int count1 = 0;
	for (int i = 0; i <s.length(); i++) 
	{
	if(s.charAt(i)>=65&&s.charAt(i)<=90)
	{
		count++;
	}
	else if(s.charAt(i)>=97&&s.charAt(i)<=122) 
	{
		count1++;
	}
	}
	System.out.print("Chaps is="+count+ " smalls is="+count1);
}
}
