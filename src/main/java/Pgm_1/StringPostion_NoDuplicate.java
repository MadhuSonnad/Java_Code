package Pgm_1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class StringPostion_NoDuplicate {
	public static void main(String[] args) 
	{

		String st = "hey i am madhu i am madhu sonnad";
		String[] sp = st.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for (int i = 0; i < sp.length; i++) 
		{
			hs.add(sp[i]);
		}
		for(String string:hs)
		{
			for (int i = 0; i < sp.length; i++) 
			{
				if(string.equals(sp[i]))
				{
					System.out.println(string+"= Position ="+(i+1));
					break;
				}

			}
		}
	}
}