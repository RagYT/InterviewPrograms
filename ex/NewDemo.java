package com.ex;

import java.util.ArrayList;
import java.util.List;

public class NewDemo {
	
	public static void main(String[] args) {
		String[] srt = {"Jan", "Feb", "March", "April", "May", "June", "July", "August",
				"Sept", "Oct", "Nov", "Dec"};
		sort(srt);
	}
	
	public static void sort(String[] str) {
		List<String> sorted = new ArrayList<String>();
		String first = null;
		for(int i=0;i<str.length-1;i++) {
			char[] ch = str[i].toCharArray();
			
			if(str[i].charAt(i) < str[i+1].charAt(i)) {
				first = str[i];
			}
//			for(int j=0;j<str.length;j++) {
//				
//			}
//			
			
		}
		
		System.out.print(first);
	}

}
