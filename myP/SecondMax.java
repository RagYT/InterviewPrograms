package com.myP;

public class SecondMax {
	
	public static void main(String[] args) {
		int[] a = {21, 43, 65, 23, 98, 13, 71, 82, 98};
		secondMax(a);
	}

	public static void secondMax(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > first) {/* If current element is greater than first then update both first and second */
				second = first;
				first = arr[i];
			}
			else if (arr[i] > second && arr[i] < first) /* If arr[i] is in between first and second then update second (check arr[i] != first) */
				second = arr[i];
		}
		System.out.println(first + " : " + second);
		
	}
}
