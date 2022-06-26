package com.ex;

public class dehaat {

	public static void main(String[] args) {
		String str = "H$ello W0orld";
		//d$lroW o0lleH
		String str2 = "To#da&y i1s mo4nd@ay";
		//reverseString(str);
		reverseString(str2);
	}
	
	public static void reverseString(String str) {
		char[] ch = str.toCharArray();
		int l=0;
		int r=ch.length-1;
		while(l<r) {
			if(!Character.isAlphabetic(ch[l]))
				l++;
			if(!Character.isAlphabetic(ch[r]))
				r--;
			char tmp = ch[l];
			ch[l]=ch[r];
			ch[r]=tmp;
			l++;
			r--;
		}
		
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]);
		
		//10 windows -> switch to widow -> click on submit -> come back to 1st window
		
		
		for(int i=0;i<10;i++) {
			driver.findElementById("Submit").click();
			driver.switchTo.window("windowId");
		}
		
		for(int i=0;i<9;i++) {
			driver.close();
			driver.switchTo.window("WindowId");
		}
		
		driver.switchTo.defaultContent();
		
		Given()
		.when()
		.contentType(contentType.JSON)
		.body(map)
		.put()
		.then()
		.statusCode(201)
		
		Given()
		.when()
		.contentType(contentType.JSON)
		.body(map)
		.put()
		.then()
		.statusCode(201);
		
		@JSONProperty("break", "break_1")
		int break_1;
		
	}
}
