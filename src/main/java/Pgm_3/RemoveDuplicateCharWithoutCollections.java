package Pgm_3;

public class RemoveDuplicateCharWithoutCollections {
public static void main(String[] args) {
	String s = "ABCABCabcabc";
	String result = "";
	
	for (int i = 0; i < s.length(); i++) {
		String ch = ""+s.charAt(i);
		
		if(result.contains(ch))
		{
			continue;
		}
		result+=ch;
	}
	System.out.println(result);
}
}
