//1.	Write a program to copy contents of one 
//      file to another file.

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Q01
{
    public static void main(String[] args) throws Exception
    {
        //File file01obj = new File("Vishal.txt");
      

     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name from data has to copy: ");
        String Sfile = sc.nextLine();         //Source file 

        System.out.println("Enter name for file in which data has to copy");
        String Dfile = sc.nextLine();         //Destination file

        FileReader fin = new FileReader(Sfile);
        FileWriter fout = new FileWriter(Dfile);

        int c;
        
        while ((c=fin.read())!=-1)
        {
            fout.write(c);
            System.out.println("value of c :  " +c+"\n");
        }
        System.out.println("file is copied succcessfully!!");

        fin.close();
        fout.close();
 
    }
    
}