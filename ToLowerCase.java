package leetcode;

import java.util.Scanner;

public class ToLowerCase {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(convertToLowerCase(s));

	}
	
	public static String convertToLowerCase(String s) {
		return s.toLowerCase();
	}

}
