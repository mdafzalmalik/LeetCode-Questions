package leetcode;

public class CountOddNumbersInAnIntervalRange {

	public static void main(String[] args) {
		int low = 3;
		int high = 7;
		System.out.print(countNoOfOdds(low, high));

	}
	
	public static int countNoOfOdds(int low, int high) {
		int total = high - low + 1;
		if(total % 2 == 0) {
			return total/2;
		}else {
			if(low % 2 == 0) {
				return total/2;
			}else {
				return (total/2) + 1;
			}
		}
	}

}
