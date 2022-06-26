package com.aX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_ThreeNumberSum {

	/*
	 * Three Number Sum
	   
	   Write a function that takes in a non-empty array of distinct Integers and an integer representing a
       target sum. The function should find all triplets in the array that sum up to the target sum and return
	   a two-dimensional array of all these triplets. The numbers in each triplet should be ordered in
 	   ascending order, and the triplets themselves should be ordered in ascending order with respect to
	   the numbers they hold.
	   
	   If no three numbers sum up to the target sum, the function should return an empty array.
	   
	   Sample Input
	   array - [12, 3, 1, 2, -6, 5, -8, 6]
	   targetSum = 0
	   
	   Sample Output
	   [(-8, 2, 6), (-8, 3, 5), (-6, 1, 5)]
	 * 
	 */
	
	
	public static void main(String args[]) {
	
		int arr[] = {12, 3, 1, 2, -6 , 5, -8, 6};
		int targetSum = 0;
		
		List<Integer[]> allTriplets = threeNumberSum(arr,targetSum);
		
		for(Integer[] row : allTriplets) {
			System.out.println(Arrays.toString(row));
		}
		
	}
	
	// O(n^2) T and O(n) S
	public static List<Integer[]> threeNumberSum(int[] arr, int targetSum) {
		
		Arrays.sort(arr);// {-8, -6, 1, 2, 3, 5, 6, 12}
		List<Integer[]> triplets = new ArrayList<Integer[]>(); //Make a note of how its defined
	
		for(int i=0; i< arr.length - 2; i++) { //here length -2 because at least we need 3 numbers to sum up
			int left = i+1;
			int right = arr.length-1;
			
			while(left<right) {
				int currentSum = arr[i] + arr[left] + arr[right];
				if(currentSum == targetSum) {
					Integer[] newTriplets = { arr[i], arr[left], arr[right] };
					triplets.add(newTriplets); //here we cannot add individual elements into arrayList so newTriplets created
					left++;
					right--;
				} else if (currentSum < targetSum)
							left++;
				  else if (currentSum > targetSum)
					  		right--;
			}
		}
		return triplets;
	}
	
	/* Solution:
	 * Sort the array.
	 * Loop thru array with n-2 length.
	 * Use 3 pointers arrayIndex, left and right which points to the array.
	 * 
	 */
	

}
