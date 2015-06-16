package com.logesh.utils;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import com.logesh.utils.CSVReader;
import com.opencsv.CSVWriter;
 
public class TryCSVReader {
	public static final Object [] SITE_RULE_CSV_HEADER ={"groupId","groupNameHierarchy","groupname","subnetMask","pdsId","pdsName"};
    public static void main(String[] args) 
    {
    	
        CSVReader reader = null;
        FileWriter fileWriter = null;
        CSVPrinter csvPrinter = null;
		String fileName = "Site_Rules_";
		File csv = null;
		
		CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator("\n");

        try
        {
            //Get the CSVReader instance with specifying the delimiter to be used
            reader = new CSVReader(new FileReader("C:\\Users\\lorajend\\Downloads\\Site_Rules_.csv"),',');
            File directory = new File("C:\\temp\\csvexport");
			if(!(directory.exists())){
				directory.mkdir();
			}
//			csv = File.createTempFile(fileName,".csv",directory);
//			fileWriter = new FileWriter(csv);
//			csvPrinter = new CSVPrinter(fileWriter, csvFileFormat);
//			csvPrinter.printRecord(SITE_RULE_CSV_HEADER);
			boolean header =true;
			for(String [] nextLine : reader.readAll()){
//				if(header){
//            		header = false;
//            		if(Arrays.equals(nextLine, SITE_RULE_CSV_HEADER)){
//            			continue;
//            		}
//            		else{
//            			throw  new IOException("Invalid File Format");
//            		}
//            	}
				
				if(nextLine.length<6){ // If all the fields are not present add some empty spaces to avoid null pointer exception
					List<String> nextLineList = new ArrayList<String>();
					for(String nextToken : nextLine){
						nextLineList.add(nextToken);
					}
	            	for(int i=nextLine.length;i<=5;i++){
	            			nextLineList.add(" ");
	            	}
	            	nextLine = new String[nextLineList.size()];
	            	nextLineList.toArray(nextLine);
            	}
				for(String token : nextLine)
				System.out.println(token+"EOL");
			}
			
			
//			while ((nextLine = reader.readNext()) != null) 
//            {
//				//Object [] temp = Arrays.copyOf(nextLine, nextLine.length);
//				csvPrinter.printRecord(nextLine);
//				//temp =null;
//            }
			
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
            	if(csvPrinter!=null)
            	csvPrinter.close();
            	if(reader!=null)
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}