package com.ex;

import java.util.HashMap;
import java.util.List;

public class fibonacii {

	public static void main(String[] args) {
		//fibo(50);
		//swap(10,40);
		//reverseNumber(43123);
		repeatedChars("Raghavendra");
		
		
	}
	
	public static void repeatedChars(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			
		}
		
		//api -> stateName -> response of cities

//		List<String> cities = RestAssured
//		.Given()
//		.queryParam("State", "Karnataka")
//		.get("https://getcities.com")
//		.then()
//		.extract()
//		.path("cities");
//		
//		Select sel = new Select(elementPathForSelect);
//		sel.getOptions().toString();
//		
//		cities.contains(citiesFromselect.get(0).getText())
		
		
		for(int i=0;i<ch.length;i++) {
			if(map.containsKey(ch[i]))
				map.put(ch[i], map.get(ch[i]) + 1);
			else map.put(ch[i], 1);
		}
		int counter = 0;
		char ch1 = 0;
		
		for(char c: map.keySet()) {
			if(map.get(c) > counter) {
				counter = map.get(c);
				ch1 = c;
			}
				
			//System.out.println(c + ":" + map.get(c) + " ");
		}
		System.out.println(ch1 +":"+counter);
	}
	
	public static void reverseNumber(int n) {
		String rev = "";
		while(n !=0) {
			int rem = n % 10;
			rev = rev + rem;
			n = n/ 10;
		}
		System.out.println(Integer.valueOf(rev) + 1);
		
	}
	
	public static void swap(int a, int b) {
		a = a+ b;
		b = a-b;
		a = a-b;
		System.out.println("A:"+a + "B:" +b);
	}
	
	public static void fibo(int n) {
		int a = 0;
		int b = 1;
		int fib = 0;
		System.out.print(a + "," + b + ",");
		
		for(int i=0;i<n;i++) {
			fib = a + b;
			a = b;
			b = fib;
			System.out.print(fib +",");
		}
		
	}

}
