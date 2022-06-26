package com.aX;


/*
 *  Given two non-empty arrays of Integers, write a function that determines whether the second array
	is a subsequence of the first one.
	
	A subsequence of an array is a set of numbers that aren't necessarily adjacent in the array but that
	are in the same order as they appear in the array. For instance, the numbers 1, 3, 47 form a
	subsequence of the array [1, 2, 3, 47], and so do the numbers [2, 4] . Note that a single
	number in an array and the array itself are both valid subsequences of the array.
	
	Sample Input
	array = 15, 1, 22, 25, 6, -1, 8, 10]
	sequence - [1, 6, -1, 10]
	
	Sample Output
	true
 */

public class C_ValidateSubSequence {
	
	public static void main(String[] args) {
		int arr[] = {5, 1, 22, 25, 6, -1, 8, 10};
		int subSequence[] = {1, 6, -1, 10};
		System.out.print(validateSubsequence(arr,subSequence));
		
	}
	// Learn how to stop array loop when subsequence is treversed, Ans: using it in same while condition
	public static boolean validateSubsequence(int[] arr, int[] subSequence) {
		int arIndex= 0;
		int subIndex =0;
		while(arIndex < arr.length && subIndex < subSequence.length) {
			if(subSequence[subIndex] == arr[arIndex]) 
				subIndex++;
			arIndex++; // It doesnt matter whether its equal or not we have to move array index mandatorily
		}
		return subIndex == subSequence.length; //If both lengths are equal then it has subsequence
	}

	
	/*
	 *  Solution: 
		Loop thru both array at once by keeping 2 pointers to each, 
		If number in subSequence is equal to number in array then increment subsequence and array pointers both
		If its not equal then increment only array pointer
		If subsequence index is equal to length of subsequence array then its a valid subSequence else its not.
	 *	
	 */
	
}

