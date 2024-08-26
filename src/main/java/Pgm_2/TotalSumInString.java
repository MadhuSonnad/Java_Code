package Pgm_2;

public class TotalSumInString {
	public static void main(String[] args) {
		String s="1j23j49";
		int sum = 0;
		int tsum = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				int n = s.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else
			{
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
	}
}
