package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DemoNew {
	//"1,3,2,6,8,2,3,4,5,1
//	it0: "1,3,2,6,8,2,3,4,5,1"
//		 it1: "2,1,5,7,1,2,3,4"
//		 it2: "1,4,6,1,2,3"
	public static void main(String[] args) {
		int[] arr = {1,3,2,6,8,2,3,4,5,1};
		//ArrayList<Integer> arr = Arrays.asList(1,3,2,6,8,2,3,4,5,1);
		//findDuplicates(arr);
		//dupValues.clear();
		
		List<Integer> visited = new ArrayList<Integer>();
		visited.add(1);
		visited.add(2);
		visited.add(3);
		visited.add(4);
		System.out.print(visited.contains(5));
	}
	
	public static void findDuplicates(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else map.put(arr[i], 1);
		}
		
		
		List<Integer> dupValues = new ArrayList<Integer>();
		
		int min = Integer.MAX_VALUE;
		for(Integer i:map.keySet()) {
			if(map.get(arr[i]) > 1) {
				//System.out.println(i +":"+map.get(arr[i]));
				if(i<min)
					min=i;
			}
		}
		
		System.out.println(min);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-min !=0)
				dupValues.add(arr[i]-min);
		}
		System.out.println(dupValues);
		Object[] array = dupValues.toArray();
		//if(dupValues != null)
			//findDuplicates(int[](dupValues.toArray()));
	}

}

