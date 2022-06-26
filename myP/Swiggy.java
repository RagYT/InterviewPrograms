package com.myP;

import java.util.ArrayList;
import java.util.List;

public class Swiggy {

	//pwwke wke
	//https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/
	public static void main(String[] args) {
		String str = "pwwkew";
		char[] ch = str.toCharArray();
		
		//String s = "";
		List<Character> lst = new ArrayList<Character>();
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]!=ch[i+1])
				lst.add(ch[i]);
			
		}
		
		for(Character c:lst)
			System.out.print(c);
		
		
//		int[] alp = new int[26];
//		//int[] chAl = new int[26];
//		
//		for(int i=0;i<ch.length;i++) {
//			alp['a' - ch[i]]++;
//			//chAl[ch['a' - i]]++;
//		}
//		System.out.println(alp);
	}
	
}
