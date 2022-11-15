package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SalesDataAnalyzer {

    int count=0;
    int index=0;
    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readFile(String fileName) {
        try(FileReader reader=new FileReader(fileName);
        BufferedReader buffer=new BufferedReader(reader)){
        String line=buffer.readLine();
        while ((line= buffer.readLine())!=null);
            { count++;}

        }catch(IOException exception){
            exception.getMessage();
        }
//for reading the single line using instance variable.
        SalesRecord[] salesRecords=new SalesRecord[count];
        try( FileReader fileReader=new FileReader(fileName);
             BufferedReader buffer=new BufferedReader(fileReader)) {

            String line=buffer.readLine();


        }catch(IOException exception){}
        return null;
    }



}
