package com.myP;

import java.util.HashSet;
import java.util.Set;

public class Merge2ArraysWithSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {41,2,5,61,7,24,93,8,1};
		int[] arr2 = {10,2,3,4,5,99,6,9,1};
		//[1,2,3,4,5,6,7,8,9]
		Set<Integer> arr3 = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)  arr3.add(arr1[i]);
		for(int i=0;i<arr2.length;i++)  arr3.add(arr2[i]);
		
		for(Integer i:arr3) System.out.print(i + " ");
	}

}
