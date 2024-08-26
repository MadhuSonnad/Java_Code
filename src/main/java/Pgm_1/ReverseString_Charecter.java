package Pgm_1;

public class ReverseString_Charecter 
{
public static void main(String[] args) 
{
	String s="Software_Tester";
	for (int i =s.length()-1;i>=0; i--) 
	{
	System.out.print(s.charAt(i));	
	}
	
	String st="Software_Tester";
	char[] s1 = st.toCharArray();
	for (int i =s1.length-1;i>=0; i--) 
	{
	System.out.println(s1[i]);	
	}
	
	String a="Software_Tester";
	String sa=" ";
	for (int i=a.length()-1;i>=0; i--) 	
	{
		sa=sa+a.charAt(i);
	}
	System.out.println(sa);
}	
}
