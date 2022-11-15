package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SalesDataAnalyzer {
    SalesRecord sales=null;
    int count=0;

    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readFile(String fileName) {




        try (FileReader reader=new FileReader(fileName);
             BufferedReader buffer =new BufferedReader(reader))
        {

            String line= buffer.readLine();
           /* String line1= buffer.readLine();*/
            while((line= buffer.readLine())!=null)
            {
            count++;
            }

        }catch (IOException exception){
            exception.getMessage();
        }

       SalesRecord[] salesRecords=new SalesRecord[count];

        try(FileReader reader =new FileReader(fileName);
            BufferedReader buffer =new BufferedReader(reader)) {

            String line=buffer.readLine();
            int index=0;
            while ((line= buffer.readLine())!=null){
                String[] array=line.split(",");
                sales=new SalesRecord();
                sales.setDate(array[0]);
                sales.setCustomer_id(Integer.parseInt(array[1]));
                sales.setProduct_category(Integer.parseInt(array[2]));
                sales.setPayment_method(array[3]);
                sales.setAmount(Double.parseDouble(array[4]));
                sales.setTime_on_site(Double.parseDouble(array[5]));
                sales.setClicks_in_site(Integer.parseInt(array[6]));
                salesRecords[index]=sales;
                index++;
            }


        } catch (IOException exception ) {
            exception.getMessage();
        }
        return salesRecords;
    }

    public static void main(String[] args) {
        SalesDataAnalyzer salesDataAnalyzer=new SalesDataAnalyzer();
        SalesRecord[] arr= salesDataAnalyzer.readFile("src/main/resources/purchase_details.csv");
        for (SalesRecord num:arr
             ) {
            System.out.println(num);
        }
    }


}
