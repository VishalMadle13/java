import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import javax.annotation.processing.FilerException;

//6.	Write Java program to read a file line by line

public class Q06
{
    public static void main(String[] args)
    {

        //Reading the file line by line 
        //By BufferedReader method

    //    try 
    //    {
    //        File f =  new File("Vishal.txt");
    //        FileReader fr = new FileReader(f);
    //        BufferedReader br = new BufferedReader(fr);
    //        StringBuffer sb = new StringBuffer();

    //        String line;


    //        while((line=br.readLine())!=null)
    //        {
    //            sb.append(line);
    //            sb.append("\n");

    //        }

    //        System.out.println("Content oof the file "+f.getName()+" is : \n ");
    //        System.out.println(sb.toString());



    //        System.out.println("\n\n!!Successfully read the file !!");
    //    } 
    //    catch(Exception e)
    //    {
    //        e.printStackTrace();
    //    }







    // Reading file line by line
    // By Scanner  method 



try
        {   
            FileInputStream fin = new FileInputStream("Vishal.txt"); // file is opened for reading

            Scanner sc =new Scanner(fin);     // file is scanned
            System.out.println("Content of the file  is : \n");
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();     //SCanning the line by line content in file
                System.out.println(line);

            }
            
            sc.close();
            System.out.print("!! Successfully read the file !!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }










    }

}

