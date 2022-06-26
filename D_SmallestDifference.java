package com.aX;

import java.util.Arrays;

public class D_SmallestDifference {

	public static void main(String[] args) {
		
		int[] arr1 = {-1, 5, 10, 20, 28, 3, 26};
		int[] arr2 = {100, 134, 135, 15, 17};
		
		int[] pairs = smallestDifference(arr1,arr2);
		
		for(int i=0;i<pairs.length;i++)
			System.out.println(pairs[i]);
	}
	
	
	// -1, 3, 5, 10, 20, 28
	// 15, 17, 26, 134, 145
	// O(nlog(n)+O(mlog(m) time | O(1) Space
	public static int[] smallestDifference(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int arr1Idx = 0;
		int arr2Idx = 0;
		
		int smallestDiff = Integer.MAX_VALUE; // defining max value because the first output value is always less than maximum number.
		int currentDiff = Integer.MAX_VALUE;
		int[] smallestPairs = new int[2]; // here defining constant 2 because we have to return only 1 pair i.e 2 numbers. 
		
		while(arr1Idx < arr1.length && arr2Idx < arr2.length) {
			int firstNum = arr1[arr1Idx]; //these are defined just to increase understandability
			int secondNum = arr2[arr2Idx]; 
			if(firstNum < secondNum) {
				currentDiff = secondNum - firstNum; // We can also use abs function, then will not be able to increment particular array value
				arr1Idx++; // incrementing only 1st index because 1st element is smaller, if we increase it difference becomes smaller with other numbers.
			} else
			if(secondNum < firstNum) {
				currentDiff = firstNum - secondNum;
				arr2Idx++;
			} else return new int[] {firstNum, secondNum}; // if both numbers are equal, you can just break the loop since this will be the smallest.
			if(currentDiff < smallestDiff) {
				smallestDiff = currentDiff;
				smallestPairs = new int[] {firstNum, secondNum};  //adding 2 elements into array
			}
		}
		
		return smallestPairs;
	}
}

