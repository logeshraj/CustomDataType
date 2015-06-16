package com.logesh.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass1 {
	public static void main(String args[] ) throws Exception {
        // Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	int nNum = Integer.parseInt(br.readLine());
        	long sum =0;
        	for(int j=0;j<nNum;j++){
        		String string[] = br.readLine().replaceAll("\\s+"," ").split(" ");
        		long nTimes = Long.parseLong(string[0]);
        		int num = Integer.parseInt(string[1]);
        		sum+=nTimes*num;
        		if(sum>=10)
        			sum=addDigits(sum);
        	}
        	//sum = addDigits(sum);
            System.out.println(sum);
        }
    }
	public static long addDigits (long sum){
		while(sum>=10){
    		char[] numS = (sum+"").toCharArray();
    		sum=0;
    		for(char c : numS){
    			sum+=(int)Character.getNumericValue(c); 
    		}
    		
    	}
		return sum;
	}
}
