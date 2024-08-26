package Pgm_1;

public class StringMethods {
public static void main(String[] args) {
	String s="Tester";
	System.out.println(s);
	
	String s1="Tester";
	System.out.println(s1.charAt(3));
	
	String s2="Tester";
	char[] ss = s2.toCharArray();
	System.out.println(ss.length);
	
	String s3="Tester";
	System.out.println(s3.indexOf('r'));
	
	String am = "Hello";
	String am1 = "Kannada";
	String am2 = "is the Best language";
	System.out.println(am+" "+am1+" "+am2);
	

	String s4="Tester hello";
	System.out.println(s4.contains("hello"));
	

	String s5="Tester hello1";
	System.out.println(s5.endsWith("hello1"));
	

	String s6="Tester";
	System.out.println(s6.isEmpty());
	

	String s7="Tester";
	System.out.println(s7.replace('r','S'));
	
}
}
