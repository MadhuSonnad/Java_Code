package Pgm_2;

import java.util.LinkedHashSet;

public class VlovewsInString {
	public static void main(String[] args) {
		String s="Testeris";
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
				System.out.println(s.charAt(i)+"="+count);
		}
	}
	System.out.println("the totl number is="+count);
}
}