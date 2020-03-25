package com.maven.tddjunit;

public class RemoveA {
	public static String removeAinFirst2(String input) {
		
		int length = input.length();
		String result = "";

		if(length == 0) {
			result = "";
		
		} else if(length == 1) {
			if(input.charAt(0) != 'A') {
				result += input.charAt(0);
			}

		} else {
			if(input.charAt(0) != 'A') {
				result += input.charAt(0);
			} 
			if(input.charAt(1) != 'A') {
				result += input.charAt(1);
			}
			if(length > 2) {
				result += input.substring(2);
			}
		}

		return result;

	}
}
