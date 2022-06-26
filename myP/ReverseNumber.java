package com.myP;

import java.util.Arrays;

public class ReverseNumber {
	
	public static void main(String[] args) {
//		reverseNum(1234);
//		System.out.println(primeNum(97));
//		primeUptoN(100);
//		fibonacci(10);
		int [] arr = {5,3,9,6,8,10,2,1};
		//sort(arr);
		
		
		sort("RAGraghavendra");
		//SOrt using inbuilt function
		String s = "RAGraghavendra";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		System.out.print(ch);
		
		//Bubble sort: swapping adjecent elements, 
//		for (int i = 0; i < n-1; i++)
//            for (int j = 0; j < n-i-1; j++)
//                if (arr[j] > arr[j+1])
	}
	
	//THis is selection sort
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]> arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +",");
	}
	
	public static void sort(String str) {
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]> arr[j]) {
					char tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +",");
	}
	
	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		System.out.print(a +"," +b+",");
		for(int i=2;i<n;i++) {
			int fib = a + b;
			System.out.print(fib +",");
			a=b;
			b=fib;
		}
	}
	
	public static void reverseNum(int num) {
		int rev = 0;
		while(num!=0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		System.out.println("Reverse: " +rev);
	}
	
	public static boolean primeNum(int n) {
		for(int i=2;i<Math.sqrt(n);i++) 
			if(n % i == 0) 
				return false;
		return true;
	}
	
	//n*log(log(n))
	public static void primeUptoN(int n) {
		int[] prime = new int[n+1];
		Arrays.fill(prime, 1);
		prime[0] = 0;
		
		for(int i=2;i<=Math.sqrt(n);i++) 
			if(prime[i] == 1) 
				for(int j=i*i;j<=n;j=j+i) 
						prime[j]=0;
				
		for(int i=2;i<prime.length;i++)
			if(prime[i] == 1)
				System.out.print(i +",");
	}
}
