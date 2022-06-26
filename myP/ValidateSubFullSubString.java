package com.myP;

import java.util.Arrays;

public class ValidateSubFullSubString {
	//Verify output to understand clear question
	public static void main(String[] args) {
		//subStringCheck("box","xyzboxasweoxbkqd");
		subStringCheck("good","dogoabogxgood");
		subStringCheck("pqr","xyzboxasweoxbkqdrpq");
		subStringCheck("xyzboxasweoxbkqdrpq","pqr");
		}
	
	
	public static void subStringCheck(String s1, String s2) {
		
		if(s1.length() > s2.length() || s1 == null || s2 == null) {
			System.out.println("Enter s1 char less than s2");
			return;
		}
		
		char[] ch1 = s1.toCharArray();
		Arrays.sort(ch1);
		String sortedS1 = String.valueOf(ch1); //as s1 is constant, there is no need to put this in the for loop
		
		for(int i=0;i<s2.length()-s1.length()+1;i++) {// length+1 because it was not considering last character
			
			ch1 = s2.substring(i, i + s1.length()).toCharArray(); // taking substr as 0, 0+3 always in s2, we can reuse ch1, as we are assigning ch1 to sortedS1
			Arrays.sort(ch1);
			String sortedS2 = String.valueOf(ch1);
			
//			System.out.print(sortedS1 +":"+ sortedS2+":");
//			System.out.println(sortedS1.equals(sortedS2));
			
			if(sortedS1.equals(sortedS2))
				System.out.println(i);
		}
	}
}
