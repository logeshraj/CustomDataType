package com.logesh.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
	public static void main(String args[]) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int z =0;z<T;z++){
			
			String string = br.readLine();
			int a[] = new int[string.length()];
			int count = 0;
			for(int i=0;i<string.length();i++ ){
				if(string.charAt(i)=='R'){
					a[i]=-1;					
					count++;	
				}else{
					a[i]=1;
				}
			}
			
			//maximum subarray algorithm
			int max=a[0];
			int dp[]=new int[string.length()];
			dp[0]= a[0];
			for(int i=1;i<string.length();i++){
				dp[i]=java.lang.Math.max(a[i],a[i]+dp[i-1]);
				max = java.lang.Math.max(dp[i],max);
			}
			
			System.out.println(max+count);
		}
	}

}
