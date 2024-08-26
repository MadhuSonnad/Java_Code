package Pgm_1;

import java.util.LinkedHashSet;

public class DuplicateWithPosition {
public static void main(String[] args) 
{
String spp="HELLO_madhu";
//String spp = sp.toLowerCase();
LinkedHashSet<Character> hs=new LinkedHashSet<Character>();

for (int i = 0; i < spp.length(); i++) 
{
	hs.add(spp.charAt(i));
}
for (Character chh : hs) 
{
for (int i = 0; i < spp.length(); i++) 
{
	if(chh==spp.charAt(i))
	{
		System.out.println(chh+"=postion="+(i+1));
	}
}	
}
}
}