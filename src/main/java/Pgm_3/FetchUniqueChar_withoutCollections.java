package Pgm_3;

public class FetchUniqueChar_withoutCollections {
public static void main(String[] args) {
	String s="AABBaabbcrdeeff";
	String unique="";
	
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		
		if(s.indexOf(ch)==s.lastIndexOf(ch))
		{
			unique+=ch;
		}
	}
		System.out.println(unique);
	
}
}
