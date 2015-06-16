package com.logesh.utils;

import java.io.*;

public class Solution {
	 public static void main(String args[] ) throws Exception {
	        // Read input from stdin and provide input before running

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        int freq[] = new int[127];
	        for (int i = 0; i < N; i++) {
	        	
	            String[] array = br.readLine().split(" ");
	            for(String n : array){
	            	int nint = Integer.parseInt(n);
	            	int temp[] = new int[127];
	            	for(int j=0;j<=127;j++){
	            		if(freq[j]!=0){
	            			temp[j^nint]+=freq[j];
	            		}
	            	}
	            	
	            	for(int j =0;j<=127;j++){
	            		freq[j]+=temp[j];	
	            	}
	            }
	            
	        }
	        long ans =0 ;
            for(int i=1;i<=127;i++){
            	ans=ans+(freq[i]*(freq[i+1]))/2;
            }
            long mod = 1000000007;
            ans = 
            
	        System.out.println("Hello World!");
	    }

}
