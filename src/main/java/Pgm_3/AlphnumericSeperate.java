package Pgm_3;

public class AlphnumericSeperate {

	public static void main(String[] args) {
		String s = "MadhuSonnad!23#$";
		String up = " ";
		String lw = " ";
		String sp = " ";
		String num= " ";
		for (int i = 0; i < s.length(); i++)
		{
		if (s.charAt(i)>=65&&s.charAt(i)<=90)
		{
			up=up+s.charAt(i);
		}
		else if(s.charAt(i)>=97&&s.charAt(i)<=122)
		{
			lw=lw+s.charAt(i);
		}
		else if(s.charAt(i)>=48&&s.charAt(i)<=57)
		{
			num=num+s.charAt(i);
		}
		else
		{
			sp=sp+s.charAt(i);
		}
		}
		System.out.println(up+""+lw+""+sp+""+num);
		

	}
}
