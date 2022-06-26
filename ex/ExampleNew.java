package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ExampleNew {
	
	public static void main(String[] args) {
		//String str = "My name445";
		//System.out.println(verifyNumberContains(str, 4));
		
		int arr[]={-1,2,-3,4,-5,6};
//		arrangeNums(arr);
		
		//String str = "aaa";
		//System.out.println(consecutiveCount(str));
		String str = "My name is raghvendra";
		charCount(str);
		
	}
//	part1 : {M:1, y:1, n:2, a:3, e:2,i:1}
//	part 2 : { g:1,h:1, i:1, m:1,e:2,n:2}
	public static void charCount(String str) {
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			if(map.containsKey(ch[i]))
				map.put(ch[i], map.get(ch[i])+1);
			else
				map.put(ch[i], 1);
		}
		
		for(Character c:ch) {
			System.out.print(c + ":" + map.get(c) +" ");
		}
		System.out.println();
		for(Character c:ch) {
			List<Character> s = (List<Character>) map.keySet();
			Arrays.sort(s.toArray());
			System.out.print(s);
			if(map.get(c) == 1)
				System.out.print(c + ":" + map.get(c) +" ");
		}
		//System.out.println();
//		for(Character c:ch) {
//			if(map.get(c) > 1)
//				System.out.println(c + ":" + map.get(c) +" ");
//		}
	}
	public static boolean consecutiveCount(String str) {
		char[] ch = str.toCharArray();
		int counter = 0;
		StringBuilder sbu = new StringBuilder();
		for(int i=0;i<str.length()-1;i++) {
			if(ch[i] == ch[i+1]) {
				counter= counter + 2;
				if(counter > 2)
					return false;
				sbu.append(ch[i+1]);
				i++;
			} else if(ch[i] != ch[i+1]) {
				counter = 0;
				sbu.append(ch[i]);
			}
			//sbu.append(ch[i+1]);
		}
		if(ch[ch.length-1] != ch[ch.length-2])
			sbu.append(ch[ch.length-1]);
		System.out.println(sbu);
		System.out.println(counter);
		return true;
	}
	
	public static void arrangeNums(int[] arr) {
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			if(arr[l] > 0)
				l++;
			if(arr[r] < 0)
				r--;
			int tmp = arr[l];
			arr[l] = arr[r];
			arr[r] = tmp;
			l++;
			r--;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static boolean verifyNumberContains(String str, int value) {
		char[] ch = str.toCharArray();
		System.out.println(String.valueOf(ch[7]));
		System.out.println(String.valueOf(value));
		for(int i=0;i<ch.length;i++) {
			if(String.valueOf(ch[i]).equals(String.valueOf(value))) {
				return true;
			}
		}
		return false;
		
	}

}
