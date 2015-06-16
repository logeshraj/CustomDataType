package com.logesh.utils;

import java.util.regex.Pattern;

public class Solution8 {
	public static final Pattern pattern = Pattern.compile("^-?\\d+$");
	public static void main(String args[]){
		Solution8 solution = new Solution8();
		solution.findIfInt();
	}
	public void findIfInt(){
		System.out.println(isInt("123"));
		System.out.println(isInt("asga 12"));
	}
	public boolean isInt(String str)
	{
	    if (str == null) {
	            return false;
	    }
	    int length = str.length();
	    if (length == 0) {
	            return false;
	    }
	    int i = 0;
	    if (str.charAt(0) == '-') {
	            if (length == 1) {
	                    return false;
	            }
	            i = 1;
	    }
	    for (; i < length; i++) {
	            char c = str.charAt(i);
	            if (c <= '/' || c >= ':') {
	                    return false;
	            }
	    }
	    return true;
	}

}
