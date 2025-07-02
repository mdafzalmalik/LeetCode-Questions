package leetcode;

import java.util.Scanner;

public class BuildArrayFromPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] ans = buildArray(arr);
		
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
	public static int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];
        for(int i = 0; i < ans.length; i++) {
        	ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
