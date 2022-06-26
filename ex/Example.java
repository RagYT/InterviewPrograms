package com.ex;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,4,7,2,2,1,7,8,0};
		//findLocalMinima(arr);
		stringCompare("abcadbcaa");
		stringCompare("abcdbcca");
		//abcadbcaa abcdbcca
	}
	
	public static void stringCompare(String str) {
		int mid = str.length()/2;
		char[] chl = null;
		chl = str.substring(0,mid).toCharArray();
		Arrays.sort(chl);
		String left = String.valueOf(chl);
		
		if(str.length() % 2 != 0) 
			chl = str.substring(mid+1,str.length()).toCharArray();
		else 
			chl = str.substring(mid,str.length()).toCharArray();

		Arrays.sort(chl);
		String right = String.valueOf(chl);
		
		System.out.print(left + ":"+ right +":");
		
		if(left.equals(right))
			System.out.println("Left string is equal to right");
		else
			System.out.println("Left string is NOT equal to right");
		
	}
	
	public static void findLocalMinima(int[] arr) {
		if(arr[0] < arr[1])
			System.out.print(arr[0] + " ");
		
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i] < arr[i-1] && arr[i] < arr[i+1])
				System.out.print(arr[i] + " ");
		}
		
		if(arr[arr.length-1] < arr[arr.length-2])
			System.out.print(arr[arr.length-1] + " ");
	}
}
