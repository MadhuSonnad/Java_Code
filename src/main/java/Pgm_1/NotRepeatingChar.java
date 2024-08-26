package Pgm_1;

import java.util.LinkedHashSet;

public class NotRepeatingChar {
public static void main(String[] args) {
	
	String s="tester";
	LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) 
	{
		hs.add(s.charAt(i));	
	}

	for(Character ch:hs)
	{
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(ch+"=not repeating="+count);
		}
}
}
}