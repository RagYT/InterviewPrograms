package com.ex;

public class Pgm {

	public static void main(String[] args) {
		int[] arr = {1,0,1,1,0,0,2,1,2,2,0};
		
		sort(arr);
	}
	public static void sort(int[] arr) {
		int one = 0;//4
		int two = 0;//3
		int zero = 0;//5
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				zero++;
			else if(arr[i]==1)
				one++;
			else if(arr[i]==2)
				two++;
		}
		
		for(int i=0;i<one;i++) {
			System.out.print(1+", ");
		}
		for(int i=0;i<zero;i++) {
			System.out.print(0+", ");
		}
		for(int i=0;i<two;i++) {
			System.out.print(2+", ");
		}
	}
}
