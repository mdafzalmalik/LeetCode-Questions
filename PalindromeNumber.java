package leetcode;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPalindromeNo(n));

	}
	
	public static boolean isPalindromeNo(int n) {
		String s = Integer.toString(n);
		int len = s.length();
		int i = 0;
		while(i < len/2) {
			if(s.charAt(i) != s.charAt(len -1 -i)) {
				return false;
			}
			i++;
		}
		return true;
	}

}
