package com.ex;

import java.util.ArrayList;
import java.util.List;

public class Java {

	public static void main(String[] args) {
		//int[] arr = {3,2,1,1,4};
		List<Integer> arrLst = new ArrayList<Integer>();
		arrLst.add(3);
		arrLst.add(2);
		arrLst.add(1);
		arrLst.add(1);
		arrLst.add(4);
		arrLst.add(7);
		arrLst.add(8);
		arrLst.add(9);
		arrLst.add(0);
		
		substractArrays(arrLst);
	}
	
	public static int findMIn(List<Integer> arr) {
		int min = arr.get(0);
		
		for(int i=0;i<arr.size()-1;i++) {
			if(min>arr.get(i+1))
				min = arr.get(i+1);
		}
		
		return min;
	}
	public static void substractArrays(List<Integer> arr) {
		int min = findMIn(arr);
		//System.out.println("min:" +min);
		List<Integer> subArr = new ArrayList<Integer>();
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i) - min != 0)
				subArr.add(arr.get(i) - min);
		}
		
		for(int i=0;i<subArr.size();i++) 
			System.out.print(subArr.get(i));
		System.out.println();
		
		if(subArr.size() != 0)
			substractArrays(subArr);
	}

}
