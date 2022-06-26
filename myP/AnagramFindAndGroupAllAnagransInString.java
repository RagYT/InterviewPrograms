package com.myP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFindAndGroupAllAnagransInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.youtube.com/watch?v=fYgU6Bi2fRg
		//https://www.youtube.com/watch?v=4rAc8Oo0kpo
		List<String> words = Arrays.asList("eat","tat","ate","ab","att","tea","ba","rag","aet");
		System.out.println(findAnagrams(words));
	}
	
	//Solution: sort each word in the string and put sortedWord as key in hashmap and word as value
	public static Map<String, List<String>> findAnagrams(List<String> words){
		
		Map<String, List<String>> anagramsList = new HashMap<String, List<String>>();
		
		if(words.size() == 0 || words == null) return null;
		
		for(String word:words) {//eat
			char[] ch = word.trim().toCharArray();
			Arrays.sort(ch); //it uses quicksort
			String sortedWord = String.valueOf(ch);//aet
			
			if(anagramsList.containsKey(sortedWord)) {
				List<String> newList = anagramsList.get(sortedWord); // getting all values present in list
				newList.add(word); //adding another value to the list for sortedWord key
				anagramsList.put(sortedWord, newList);
				//anagramsList.put(sortedWord, anagramsList.get(sortedWord).add(word)); not possible bcoz of return type of anagram
			}else 
			{
				List<String> list = new ArrayList<String>(); //creating new list of strings
				list.add(word); //Adding new value to the list
				anagramsList.put(sortedWord, list);
			}
			
		}
		
		for(String s:anagramsList.keySet()) {
			if(anagramsList.get(s).size() > 1) 
				System.out.println(anagramsList.get(s)); // it prints only anagrams
		}
		
		return anagramsList;
	}

}
