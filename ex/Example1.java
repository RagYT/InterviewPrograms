package com.ex;

import java.util.HashMap;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Raghavendra is working with Pharmeasyy";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(map.containsKey(ch[i]))
				map.put(ch[i], map.get(ch[i])+1);
			else
				map.put(ch[i], 1);
		}
		
		for(Character c:map.keySet())
//		  if(map.get(c) > 1)
//			  if(c != ' ')
//				  System.out.println(c+ ":" +map.get(c));
			if(map.get(c) == 1)
				System.out.println(c+ ":" +map.get(c));
	}

}
