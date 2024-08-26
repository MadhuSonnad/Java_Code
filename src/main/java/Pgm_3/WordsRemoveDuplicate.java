package Pgm_3;

public class WordsRemoveDuplicate {

	public static void main(String[] args) 
	{
		String s = "Hey Hey word word hello hello SAME test ";

		String sp = s.toLowerCase();
		String[] spp = sp.split(" ");

		for (int i = 0; i < spp.length; i++) {
			int count = 1;
			for (int j = i + 1 ; j < spp.length; j++) 
			{
				if (spp[i].equals(spp[j])) 
				{
					count++;
					spp[j] = "0";
				}
			}
			if (count == 1  && spp[i] != "0")
			{
				System.out.print(spp[i]+" ");	
		}
		}
	}
}
