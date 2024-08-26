package Pgm_1;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharecter {
public static void main(String[] args) {
	String s="Kannada";
	LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) 
	{
	hs.add(s.charAt(i));	
	}
	for(Character chare:hs)
	{
		System.out.println(chare);
	}
}
}
