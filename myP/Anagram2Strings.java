package com.myP;

import java.util.HashMap;

public class Anagram2Strings {

	public static void main(String[] args) {
		System.out.println(checkAnagram("caat", "taac"));
		//String.valueOf(ch[j]).toUpperCase() to convert letter to uppercase
	}
	
	//Time complexity is O(n+n) = 2n = O(n) 
	
	//Solution: put 1 string in hashmap as characters, increment the count and with another string decrement hm value,
	//when all characters in hm contains 0, it can be considered as anagram else not.
	public static boolean checkAnagram(String s1, String s2) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		if(s1.length() != s2.length()) {
			System.out.println("Enter same string length"); return false;
		}
		
		for(int i=0;i<s1.length();i++) {
			if(hm.containsKey(s1.charAt(i)))
				hm.put(s1.charAt(i), hm.get(s1.charAt(i)) +1);	// increment the char count
			else
				hm.put(s1.charAt(i), 1);
		}
		
		for(int i=0;i<s2.length();i++) {
			if(hm.containsKey(s2.charAt(i)))
				hm.put(s1.charAt(i), hm.get(s1.charAt(i)) - 1); // decrement the char count to make it 0
		}
		
		for(Character c:hm.keySet()) {
			if(hm.get(c) != 0)// If any value is not 0, its not anagram
				return false;
		}
		
		return true;
	}
}
