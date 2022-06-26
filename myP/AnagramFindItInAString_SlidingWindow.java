package com.myP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramFindItInAString_SlidingWindow {

	public static void main(String[] args) {
		
		System.out.println(findAnagramInAString("abcdseraqbacba", "abc"));
	}
	
	//FOr sliding window, create seperate for loop for 1st iteration
	public static List<Integer> findAnagramInAString(String s, String p) {
		List<Integer> result = new ArrayList<Integer>();
		
		if(s == null || s.length() == 0 || s.length() < p.length()) return result;
		
		int pArr[] = new int[26];// for storing all 26 characters
		int sArr[] = new int[26]; 
		int left = 0; int right = 0;//can give right = -1 to avoid right--
		
		//put a char count into pArr and sArr, Also create first window of size p
		for(int i=0;i<p.length();i++) {
			pArr[p.charAt(i) - 'a']++;
			sArr[s.charAt(i) - 'a']++;
			right++;
		}
		right--; //here decrementing as right will be pointing to next char
		
		while(right < s.length()) {
			if(Arrays.equals(pArr, sArr)) //It returns true for acb bca
				result.add(left);//Adding 1st index of anagram
			
			right++;
			
			if(right != s.length()) 
				sArr[s.charAt(right) - 'a']++; //here taking right element and increasing count in sArr
			sArr[s.charAt(left++) - 'a']--; //here removing left element, decrementing value to 1
			//left++; giving ++ in above line is also same
		}
		
		for(int i=0;i<pArr.length;i++)
			System.out.print(pArr[i] + " ");
		System.out.println();
		for(int i=0;i<pArr.length;i++)
			System.out.print(sArr[i] + " ");
		return result;
	}

}
