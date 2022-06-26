package com.aX;

import java.util.Arrays;

//Check this -> Learn git in 15 minutes

/*
  
    Write a function that takes in a non-empty array of distinct Integers and an integer representing a
	target sum. If any two numbers in the Input array sum up to the target sum, the function should
	return them in an array, in any order. If no two numbers sum up to the target sum, the function
	should return an empty array.

	Note that the target sum has to be obtained by summing two different integers in the array, you
	can't add a single integer to itself In order to obtain the target sum.
	
	You can assume that there will be at most one pair of numbers summing up to the target sum.
	
	Sample Input
	array = (3, 5, -4, 8, 11, 1,-1, 6)
	targetSum - 10
	
	Sample Output
	[-1, 11] // the numbers could be in reverse order
 */

/* My Notes:
 * Distinct integers -> no numbers are repeated.
 * If you use hash table it will cost you extra space, but it might make algorithm faster.
 * Complexity will be O(Nlog(N)), O(1)S because we will traverse thru 1 OR 2 times for each number.
 * 
 * How to return empty array? Ans: new int[0]
 * Work on finding triplet or quadrapulet
 *   
 */

public class A_TwoNumberSum {
	
	public static void main(String[] args) {
		
		int arr[] = {3,5,4,8,11,1,-1,6,2};
		int targetSum = 10;
		
		int a[] = twoNumberSum(arr, targetSum);
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	//O(nlog(n)) | O(1)S
	public static int[] twoNumberSum(int[] arr, int targetSum) {
		
		Arrays.sort(arr); // Sort before doing below operation.
		
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			int currentSum = arr[left] + arr[right];
			
			if(currentSum == targetSum)
				return new int[] {arr[left], arr[right]};  //new array
				//System.out.println(arr[left] + ":" + arr[right]); // This will be infinite loop as no l++ or r--
			else if (currentSum <targetSum)
					left++;
			else if (currentSum > targetSum) 
					right --;
		}
		
		return new int[0]; //empty array
	}
	
	
	/* Solution:
	 * Sort then given array
	 * Loop thru the array by keeping left and right pointers, and if left > right break the loop, since we will be navigated to all the elements.
	 * If sum is less than targetSum increment left pointer.
	 * If sum is greater than targetSum, decrement right pointer.
	 * If sum is equal, return the new array by using new int[]
	 */
}
