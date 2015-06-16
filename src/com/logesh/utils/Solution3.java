package com.logesh.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution3 {
	 public static void main(String args[] ) throws Exception {
	        //Read input from stdin and provide input before running

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        
	        for (int i = 0; i < N; i++) {
	        	//Set<Integer> setOfLength = new HashSet<Integer>();
	            String[] numString = br.readLine().split(" ");
	            int total = Integer.parseInt(numString[0]);
	            int noInOneTeam = Integer.parseInt(numString[1]);
	            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	            for(int j=0;j<total;j++){
	            	String string = br.readLine();
	            	map.put(string.length(),map.get(string.length())==null?1:map.get(string.length())+1);
	            }
	            boolean flag = true;
	            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
	            	if(entry.getValue()%noInOneTeam!=0){
	            		flag = false;
	            		break;
	            	}
	            }
	            System.out.println(flag?"Possible":"Not possible");
	        }        
	    }
}
