package com.myP;

public class MaxSumOfSubArrayK_SlidingWindowTech {

	public static void main(String[] args) {
		int[] arr = {21,-2,9,4,-6,12,-3,44};
		System.out.println(sumOfSubarray(arr,4));
		
	}
	
	public static int sumOfSubarray(int[] arr, int k) {
		
		int maxSum = Integer.MIN_VALUE;
		int windowSum = 0;
//		int index1 = 0;	int index2 = 0;
		
		for(int i=0;i<k;i++) {
			windowSum += arr[i]; //for taking first sum
		}
		maxSum = Math.max(maxSum, windowSum);
		
		for(int i=k;i<arr.length;i++) {
			windowSum += arr[i] - arr[i - k]; //Sliding window approach for prev and next array element
			//maxSum = Math.max(maxSum, windowSum); this line and below line both works
			if(maxSum < windowSum) {
				maxSum = windowSum;
//				index1 = i-k;
//				index2 = i;
			}
		}
		//System.out.println(index1 + ":" + index2);
		return maxSum;
	}
}
