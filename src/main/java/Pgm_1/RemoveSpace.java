package Pgm_1;

public class RemoveSpace {
public static void main(String[] args) {
	String s="hello word saying the last time";
	String rp = s.replaceAll(" ", "");
	System.out.println(rp);
	System.out.println(rp.length());
}
}
