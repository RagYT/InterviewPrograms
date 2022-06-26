package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soko {

	public static void main(String[] args) {
		//number of persons, names: ab, bc, de, bc, ab, pq, pqr, ab, ab
//		String a = "ab1@email.com";
//		System.out.println(a.indexOf("@")-1);
		
		List<String> lst = Arrays.asList("ab", "bc", "de", "bc", "ab", "pq", "pqr", "ab", "ab");
		assignEmails(lst);
		
	}
	
	public static void assignEmails(List<String> str) {
		List<String> generatedEmail = new ArrayList<String>();
		
		for(int i=0;i<str.size();i++) {
			String s = str.get(i) + "@email.com";
			if(generatedEmail.contains(s)) {
				int index = s.indexOf("@")-1;
				String newEmail = s.substring(0, s.indexOf("@")) + String.valueOf(2) + s.substring(index+1, s.length());
//				char[] ch = newEmail.toCharArray();
//				if(generatedEmail.contains(newEmail)){
//					String newE = s.substring(0, s.indexOf("@")) + s.replace(ch[index], (char) (ch[index]+1)) + s.substring(index+1, s.length());
//					generatedEmail.add(newE);
//				}
//				else
				generatedEmail.add(newEmail);
				
				//Integer.valueOf(s.charAt(index))+1
			}else {
			generatedEmail.add(s);
			}
		}
		
		System.out.println(generatedEmail.toString());
	}

}
