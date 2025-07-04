package leetcode;

public class RotateArrayReversalAlgo {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		rotatekTimesArray(arr, k);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void rotatekTimesArray(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverseRange(arr, 0, n-1);
		reverseRange(arr, 0, k-1);
		reverseRange(arr, k, n-1);
	}
	
	public static void reverseRange(int[] arr, int i, int j) {
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
