package in.hubachov.codewars.java;

/**
 * You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of
 * the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would
 * make this happen, return -1.

 #For example:

 Let's say you are given the array {1,2,3,4,3,2,1}:
 Your function will return the index 3, because at the 3rd position of the array, the sum of left side of the index
 ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.

 Let's look at another one.
 You are given the array {1,100,50,-51,1,1}:
 Your function will return the index 1, because at the 1st position of the array, the sum of left side of the index
 ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.

 Note: Please remember that in most programming/scripting languages the index of an array starts at 0.

 #Input: An integer array of length 0 < arr < 1000. The numbers in the array can be any integer positive or negative.

 #Output: The lowest index N where the side to the left of N is equal to the side to the right of N. If you do not find
 an index that fits these rules, then you will return -1.

 #Note: If you are given an array with multiple answers, return the lowest correct index.
 An empty array should be treated like a 0 in this problem.

 * Created by Sashko on 6/15/17.
 */
public class EqualsArraySides {
/*
	public static int findEvenIndex(int[] arr) {
		int sumRight = Arrays.stream(arr).sum() - arr[0];
		int sumLeft = 0;
		for (int i = 1; i < arr.length; i++) {
			sumLeft += arr[i-1];
			sumRight -= arr[i];
			if (sumLeft == sumRight) return i;
		}
		return -1;
	}
*/
	public static int findEvenIndex(int[] arr) {
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
		}
		int left = 0;
		for (int i = 1; i < arr.length; i++) {
			left += arr[i - 1];
			sum -= arr[i];
			if (left == sum) {
				return i;
			}
		}
		return -1;
	}

}
