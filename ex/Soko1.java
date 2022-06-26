package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Soko1 {
	
	public static void main(String[] args) {
		//number of persons, names: ab, bc, de, bc, ab, pq, pqr, ab, ab
//		String a = "ab1@email.com";
//		System.out.println(a.indexOf("@")-1);
		
		List<String> lst = Arrays.asList("ab", "bc", "de", "bc", "ab", "pq", "pqr", "ab", "ab");
		assignEmails(lst);
		
	}
	
	public static void assignEmails(List<String> lst) {
		List<String> generatedEmail = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<lst.size();i++) {
			if(map.containsKey(lst.get(i))) {
				int j = map.get(lst.get(i)) +1;
				map.put(lst.get(i), j); 
				generatedEmail.add(lst.get(i) + j + "@email.com");
			}
			else {
				map.put(lst.get(i), 1);
				generatedEmail.add(lst.get(i) + "@email.com");
			}
		}
		
		System.out.println(generatedEmail.toString());
	}

}
