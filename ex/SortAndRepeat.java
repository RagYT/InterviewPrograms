package com.ex;

import java.util.HashMap;

public abstract class SortAndRepeat {

	
	// final int a ;
	
	public static void main(String[] args) {
		int[] arr = {1,5,4,3,7,6,3,2,4,5,6,7};
		sort(arr);
		
	}
	
	public static void sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] >arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
//		for(int i=0;i<arr.length;i++)
//			System.out.print(arr[i] + ", ");
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else map.put(arr[i], 1);
		}
		System.out.println();
		for(Integer i:map.keySet())
			if(map.get(i) == 1)
				System.out.println(i +":" + map.get(i));
	}
}
