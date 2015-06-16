package com.logesh.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	private BufferedReader reader = null;
	private final static char DEFAULT_DELIMITER =',';
	private List<String[]> csvObject=null;
	private char separator=DEFAULT_DELIMITER;
	private int linesSoFar=0;
	private boolean hasNext=true;
	
	public CSVReader(Reader reader) throws IOException{
		this(reader,CSVReader.DEFAULT_DELIMITER);
	}
	
	public CSVReader(Reader reader,char separator) throws IOException{
		this.reader =new BufferedReader(reader);
		this.separator = separator;
		createObject();
	}
	
	private void createObject() throws IOException{
		List<String[]> objArr = new ArrayList<String[]>();
		String line = "";
		while ((line = this.reader.readLine()) != null) 
        {
            //Get all tokens available in line
            String[] tokens = line.split(this.separator+"");
            objArr.add(tokens);
        }
		this.csvObject=objArr;
		
	}
	
	public List<String[]> readAll(){
		return this.csvObject;
	}
	
	
	
	public String[] readNext() throws IOException {
		String[] result =null;
		if(this.linesSoFar+1<=this.csvObject.size()){
			this.hasNext=true;
			result  = this.csvObject.get(this.linesSoFar);
			this.linesSoFar+=1;
		}else{
			this.hasNext=false;
		}
		
		
        return result;
    }
	public void close() throws IOException{
		this.reader.close();
	}
}
