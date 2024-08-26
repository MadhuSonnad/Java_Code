package Pgm_1;

import java.util.LinkedHashSet;

public class StringVolue {
	public static void main(String[] args) {
		String s="Testeris";
		LinkedHashSet<Character> hs=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) 
		{
			hs.add(s.charAt(i));	
		}
		int	count=0;
		for( Character ss:hs)
		{
			if(ss=='a'||ss=='e'||ss=='i'||ss=='o'||ss=='u')
			{
				count++;
				System.out.println(ss);
			}
		}
		System.out.println(s+"="+count);
	}
}
