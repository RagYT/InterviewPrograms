package com.ex;

public class Demo2 {
	
	public static void main(String[] args) {
		
		String s = "    India is  My   Country ,   . ";
		//" .   , Country   My  is India    "
		System.out.print(s.trim().replaceAll(" +", " "));
		
//		String[] str = s.trim().split(" ");
//		for(String s1:str)
//			System.out.print(s1 + ":" + str.length);
	}

}
