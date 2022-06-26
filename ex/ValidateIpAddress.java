package com.ex;

import java.util.regex.Pattern;

public class ValidateIpAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10.150.10.90
//		Pattern p = Pattern.compile("111.222.");
//		p.matcher(""); 
		
		String ip = "0.0.256.1";
		validateIpAddress(ip);
		
	}
	
	public static boolean validateIpAddress(String ip) {
		String[] ipNumbers = ip.split("\\.");
		
		if(ipNumbers.length != 4) {
			System.out.println("Enter valid ip");
			return false;
		}
		int f = 0;
		
		for(int i =0;i<ipNumbers.length;i++) {
			
			char[] ch = ipNumbers[i].toCharArray();
			int first = Integer.valueOf(String.valueOf(ch));
			if(first > 255 && first < 0) {
				System.out.println("Enter value between 0 and 255");
				return false;
			}
			if(ch.length>3) {
				System.out.println("Ip is not valid");
				return false;
			}
			
			for(int j=0;j<ch.length;j++)
				if(!Character.isDigit(ch[j])) {
					System.out.println("Ip is not valid");
					f=1;
					return false;
				}
		 }
			System.out.println("Ip is valid");
			return true;
	}

}
