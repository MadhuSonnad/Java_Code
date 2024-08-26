package Pgm_4;

public class NEW {
	public static void main(String[] args) {
		String a = "ShivlendraKumar0305@$";

		String upperLetter = "";
		String lower_letter = "";
		String SpecialCharter = "";
		String no = "";
		char[] ch = a.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				upperLetter = upperLetter + ch[i];
			} else if (ch[i] >= 97 && ch[i] <= 122) {
				lower_letter = lower_letter + ch[i];
			} else if (Character.isDigit(ch[i])) {
				no = no + ch[i];
			} else {
				SpecialCharter = SpecialCharter + ch[i];
			}
		}
		System.out.println("upper letter :         " + upperLetter);
		System.out.println("Lower Letter :         " + lower_letter);
		System.out.println("Special Character :    " + SpecialCharter);
		System.out.println("Numeric value :        " + no);
	}
}
