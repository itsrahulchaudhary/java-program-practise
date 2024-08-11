package com.rahul.test;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
	    String s = "GeeksforGeeks";
	    System.out.println(reversedString(s));

	}
	
	public static String reversedString(String str) {
		StringBuffer result = new StringBuffer();
		for(int i=str.length()-1; i>=0; i--) {
			result.append(str.charAt(i));
		}
		return result.toString();
	}
	
	public static String removeSpace(String str) {
		StringBuffer result = new StringBuffer();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}
	
	public static Boolean isBinary(String str) {
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i)=='0' || str.charAt(i) == '1')) {
				return false;
			}
		}
		
		return true;
	}

	 
}