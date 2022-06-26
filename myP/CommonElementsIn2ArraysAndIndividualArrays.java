package com.myP;

import java.util.HashMap;

public class CommonElementsIn2ArraysAndIndividualArrays {

	public static void main(String[] args) {
		int[] arr1 =  { 1, 2, 3, 4, 5, 6, 7, 2, 1, 6 };
		int[] arr2 = { 1, 3, 4, 5, 6, 9, 8, 10, 9, 7 };
		commonElements(arr1,arr2);
	}
	
	public static void commonElements(int[] arr1, int[] arr2) {
		
		HashMap<Integer, Integer> hmArr1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> hmArr2 = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			if(hmArr1.containsKey(arr1[i]))
				hmArr1.put(arr1[i], hmArr1.get(arr1[i]) + 1);
			else hmArr1.put(arr1[i], 1);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(hmArr2.containsKey(arr2[i]))
				hmArr2.put(arr2[i], hmArr2.get(arr2[i])+1);
			else hmArr2.put(arr2[i], 1);
		}
		
		for(Integer i:hmArr1.keySet()) 
			if(hmArr1.get(i) > 1) 
				System.out.print(i);
		System.out.println();
		for(Integer i:hmArr2.keySet()) 
			if(hmArr2.get(i) > 1) 
				System.out.print(i);
		
		//TO find common elements
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			if(hmArr1.containsKey(arr2[i])) // verifying if hm key of arr1 contains arr2 values, we can use same method to check chars aswell
				System.out.print(arr2[i]);
		}
		
	}
}
