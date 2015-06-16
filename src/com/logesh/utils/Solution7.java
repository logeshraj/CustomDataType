package com.logesh.utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class Solution7 {
	public static void main(String args[] ) throws Exception {
        // Read input from stdin and provide input before running
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
         	String line1[] = br.readLine().split(" ");
         	int nStrings = Integer.parseInt(line1[0]);
         	int lStrings = Integer.parseInt(line1[1]);
         	Map<Integer,ArrayList<Character>> map = new HashMap<Integer,ArrayList<Character>>();
         	
         	for(int j=0;j<nStrings;j++){
         		int k =0;
         		for(char c : br.readLine().toCharArray()){
         			List<Character> string;
         			if(map.get(k)==null){
         				string = new ArrayList<Character>();
         				string.add(c);
         			}else{
         				string = map.get(k);
         				if(!string.contains(c))
         					string.add(c);
         			}
         				
         				map.put(k,(ArrayList<Character>)string);
         				k++;
         		}
         		
         	}
         	
         	for(int j=0;j<lStrings;j++){
         		ArrayList<Character> sorted =  map.get(j);
         		Collections.sort(sorted);
         		System.out.print(sorted.get(sorted.size()/2));
         	}
         	System.out.println();
        }
    }

}
