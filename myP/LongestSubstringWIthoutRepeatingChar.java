package com.myP;

import java.util.HashMap;

public class LongestSubstringWIthoutRepeatingChar {

	public static void main(String[] args) {
		LongestSubstrWithoutRepeatingChar("aabbcdefgghhikljabcdefgh");
	}
	public static void LongestSubstrWithoutRepeatingChar(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int start = 0;
		int length = 0;
		String output = "";
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i)))
				start = Math.max(start, map.get(str.charAt(i)) + 1);
				//Moving the starting character to one next char if its present
			
			map.put(str.charAt(i), i);//updating the lastseen value of character
			if(output.length() < i-start+1)
				output = str.substring(start, i+1);

			//length = Math.max(length, i-start+1);
			//end(i)-start+1 will give the length of the string
		}
		System.out.print(output.length());
		System.out.print(output);
	}
	
	/*
	 * i=0
	 * start = 0
	 * p,0
	 * length= 0, 0-0+1 = 1
	 * 
	 * i=1
	 * start =0
	 * w,1
	 * length = 1, 1-0+1 = 2
	 * 
	 * i=2
	 * start = 0, 1+1 = 2 // calculation of start
	 * w,2
	 * length = 2, 2-2+1 = 1 == 2
	 * 
	 * i=3
	 * start = 2
	 * k,3
	 * length = 2, 3-2+1 == 2
	 * 
	 * i=4
	 * start = 2
	 * e,4
	 * length = 2, 4-2+1 == 3 //wke
	 * 
	 * i=5
	 * start = 2, 2+1 = 3 //
	 * w,5
	 * length = 3, 5-3+1 == 3 //kew
	 */
}
