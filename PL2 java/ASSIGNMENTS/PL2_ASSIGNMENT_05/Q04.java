import java.io.FileInputStream;

//4.	Write Java program to read text from file from a specified index or
//      skipping byte using FileInputStream.

import java.io.File;
public class Q04
{
    public static void main(String[] args)
    {
       try
       {

       
        FileInputStream fin = new FileInputStream("Vishal.txt");

        int i=0;
        //skipping the first 7 byte of data from the file
        fin.skip(7);
        
        //printing the data of the file : 

        System.out.println("Printing the data after index 8:  ");

        while((i=fin.read())!=-1)
        {
            System.out.println((char)i);
        }

        fin.close();


       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       
    }

    
}
