package com.logesh.utils;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Soution1 {
	 public static int count =0;
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int i = 0; i < t; i++){
	            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
	        }
	    }
	    
	    private static long Solve(int N, int C, int M){
	        int chocolates = N/C;
	        count =0;
	        count+=chocolates;
	        count+=returnWrapper(chocolates,M);
	        //System.out.println(count);
	         //Write code to solve each of the test over here
	        return count;
	    }
	    private static int returnWrapper(int n,int M){
	        if(n<=1){
	            n= n/M;
	            return n;
	        }
	        else{
	            n = n/M;
	            n +=returnWrapper(n,M);
	        }
	        return n;
	    }
}
