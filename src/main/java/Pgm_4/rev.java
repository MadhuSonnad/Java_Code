package Pgm_4;

public class rev {
public static void main(String[] args) {
	String s="MOM";
	String rev = "";
	for (int i =s.length()-1;i>=0; i--) 
	{
	rev=rev+s.charAt(i);	
	}
	if(rev.equals(s))
	{
		System.out.println("palidrome");
	}
	else
	{
		System.out.println("not p");
		
	}
}
}
