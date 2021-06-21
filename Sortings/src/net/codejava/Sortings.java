package net.codejava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;


public class Sortings {
	
	public static void main(String[] args)
    {
        BufferedReader reader = null; 
 
        BufferedWriter writer = null;
 
        //Create an ArrayList object to hold the lines of input file
 
        ArrayList<String> names = new ArrayList<String>();

 
        try
        {
            //Creating BufferedReader object to read the input file
 
            reader = new BufferedReader(new FileReader("C:\\names.txt"));
 
            //Reading all the lines of input file one by one and adding them into ArrayList
 
            String currentLine = reader.readLine();
 
            while (currentLine != null)
            {
            	
            	String str = String.join(" ", currentLine);
            	names.add(str);
                
 
                currentLine = reader.readLine();
            }
            
            
            Collections.sort(names, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                	
                	
                	 o1 = o1.substring(o1.lastIndexOf(" ")+1); // taking the last string
                	 o2 = o2.substring(o2.lastIndexOf(" ")+1); // taking the last string
                	
                	
                    return o1.compareTo(o2);  // ascending order          
                }
            });
            
            for (String line : names)
            {
            	
            	System.out.print(line); // printing the names
            	System.out.print("\n");
               
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //Closing the resources
 
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
 
                if(writer != null)
                {
                    writer.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}
