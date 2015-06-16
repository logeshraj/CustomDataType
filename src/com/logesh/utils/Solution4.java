package com.logesh.utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Solution4 {
	public static void main(String args[] ) throws Exception {
        //Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String[] nums = br.readLine().split(" ");
            int total = Integer.parseInt(nums[0]);
            int want = Integer.parseInt(nums[1]);
            Set<Integer> set = new HashSet<Integer>();
            String dresses[] = br.readLine().split(" "); 
            for(int j=0;j<total;j++){
            	int dressNum = Integer.parseInt(dresses[j]); 
            	set.add(dressNum);
            }
            System.out.println(set.size()==want?"Perfect Husband":"Lame Husband");
        }
        

       
    }
}
