package com.logesh.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5 {
	 public static void main(String args[] ) throws Exception {
	        // Read input from stdin and provide input before running

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        for (int i = 0; i < N; i++) {
	            char[] string = br.readLine().toCharArray();
	            int nOs = 0,nZs = 0,sum1 = 0,sum2 = 0;
	            for(int j=0;j<string.length;j++){
	            	if(string[j]=='O'){
	            		sum1+=nZs;
	            		nOs++;
	            	}else{
	            		sum2+=nOs;
	            		nZs++;
	            	}
	            }

	            System.out.println(java.lang.Math.min(sum1,sum2));
	        }
	    }
}
