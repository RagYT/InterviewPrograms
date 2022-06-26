package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Demo3 {
	//Given a linked list, remove the nth node from the end of list and return its head
	//1,2,3,4,5
	//nth node -2   n-k
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
		}
	}
	
	public static void main(String[] args) {
//		List<String> s = Arrays.asList("are", "bat", "ear", "code", "tab", "era");
//		groupAnagrams(s);
		
//		Node n = new Node(5);
//		Node head;
//		Node prev;
//		
//		n.next = new Node(6); 
//				
//		int count = 0;
//		while(n.next!=null) {
//			count ++;
		//}
		//while()
	}
	
//	public static void groupAnagrams(List<String> str) {
//		HashMap<String, List<String>> anagramGroup = new HashMap<String, List<String>>();
//		for(String word:str) {
//			char[] ch = word.toCharArray();
//			Arrays.sort(ch);//aer abt aer
//			
//			String sorted = String.valueOf(ch);
//			if(anagramGroup.containsKey(sorted)) {
//				List<String> list = anagramGroup.get(sorted);
//				list.add(word);
//				anagramGroup.put(sorted, list);
//			} else {
//				List<String> list = new ArrayList<String>();
//				list.add(word);
//				anagramGroup.put(sorted, list);
//			}
//		}
//		
//		for(String s: anagramGroup.keySet()) {
//			if(anagramGroup.get(s).size() > 0)
//				System.out.println(s + ":" +anagramGroup.get(s));
//		}
//	}

}
