package Pgm_1;

import java.util.LinkedHashSet;

public class StringCountInCollections {
public static void main(String[] args) {
		
		String st = "hey i am madhu i am madhu sonnad";
		String[] sp=st.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for (int i = 0; i < sp.length; i++) 
		{
		hs.add(sp[i]);			
		}
		for (String string : hs) 
		{
			int count=0;
			for (int i = 0; i < sp.length; i++) 
			{
				if (string.equals(sp[i])) 
				{
					count++;
				}
			}
					System.out.println(string+"=="+count);
					//break;
		}
}
}