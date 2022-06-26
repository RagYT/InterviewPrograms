package com.myP;

public class printNosWIthoutUsingLoop {

	public static void main(String[] args) {
		// 15 - 8
		printNos(15);
		
	}
	
	public static void printNos(int n) {
		System.out.print(n +":");
		
		if(n > 8)
			printNos(n-1);
	}
	
	// Map <String, String> data = new HashMap<String, String>()
	//data.put("username", prop.getProperty("username)); config -> username = raghav  
	//data.put("password", "raghav")  
	//Given().when().get()

}
