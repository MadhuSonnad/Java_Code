package Pgm_2;

public class AddNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 0, 4, 6, 5 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
}
}