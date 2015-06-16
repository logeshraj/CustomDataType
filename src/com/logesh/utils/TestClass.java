package com.logesh.utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
	 public static void main(String args[] ) throws Exception {
	        //Read input from stdin and provide input before running

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        for (int i = 0; i < N; i++) {
	        	String string = br.readLine().replaceAll("\\s+"," ");
	            String [] lines =string.split(" ");
	            int n = Integer.parseInt(lines[0]);
	            int x = Integer.parseInt(lines[1]);
	            int a[] = new int[n];
	            for(int j =0;j<n;j++){
	            	a[j]=Integer.parseInt(br.readLine());
	            }            
	            int sum=0;
				int start =0;
				boolean flag =false;
				for(int j=0;j<n;j++){
					sum+=a[j];
					while(sum>x){
						sum-=a[start];
						start++;
					}
					if(x==sum){
						flag=true;
						break;
					}
					
				}
				while(sum>x){
					sum-=a[start];
					start++;
				}
				if(sum==x){flag=true;}
	            System.out.println(flag?"YES":"NO");
	        }
	    }
}
