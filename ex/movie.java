package com.ex;

import java.util.HashMap;

public class movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="#340  17 cross road Moveinsync";
//		char[] ch = str.toCharArray();
//		
//		StringBuilder vowels = new StringBuilder();
//		StringBuilder consonents = new StringBuilder();
//		
//		for(int i=0;i<str.length();i++) {
//			if(!Character.isDigit(ch[i]))
//				if(ch[i] != ' ')
//					if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
//						//vowels.append(Integer.ch[i]);
//						System.out.print("0");
//					else System.out.print("1");//consonents.append(ch[i]);
//		}
		
//		System.out.println(vowels);
//		System.out.println(consonents);
		
//		int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for(int i=0;i<arr.length;i++) {
//			if(map.containsKey(arr[i]))
//				map.put(arr[i], map.get(arr[i])+1);
//			else map.put(arr[i], 1);
//		}
//		
//		for(Integer i: map.keySet())
//			System.out.print(i +": " +map.get(i) +", ");
//		
//		System.out.println();
		
		int arr[] = {20, 21, 45, 89, 89, 90};
		int f = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				f=1;
			}
		}
		if(f==0)
			System.out.print("Sorted");
		else System.out.print("Not Sorted");
//		for(int i=arr.length-1;i>0;i--)
//			System.out.print(arr[i] +", ");
	}
	
	

}
