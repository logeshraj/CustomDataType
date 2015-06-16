package com.logesh.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution6 {
	public static void main(String args[]) throws  IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i =0 ;i<T;i++){
			String rk[] = br.readLine().split(" ");
			int R = Integer.parseInt(rk[0]);
			int K = Integer.parseInt(rk[1]);
			int veryCool =0;
			int s=0;
			for(int j=1;j<=R;j++){
				if(isVeryCool(j,K))
					veryCool++;
				if(j>20000){
					s= veryCool;
				}
			}
			System.out.println(veryCool);
			//System.out.println(s);
		}
		br.close();
	}
	public static boolean isVeryCool(int R,int K){
		String r = Integer.toBinaryString(R);
		Pattern pattern = Pattern.compile("10");
        Matcher  matcher = pattern.matcher(r);
        int count = 0;
      
        while (matcher.find()){
        	int end = matcher.end();
        	if(r.length()>end&&r.charAt(end)=='1')
        	count++;
           
    	}
		if(count>=K){
			return true;
		}else{
			return false;
		}
	}
}
