//2.	Write a program to write bytes to a file.

//package PL2_ASSIGNMENT_05;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
//import java.io.OutputStream;


public class Q02
{
    public static void main(String[] args)
    {
        try
        {
           FileOutputStream fout = new FileOutputStream("Vishal.txt");

           fout.write(65);
           fout.close();
 
           System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }



        

    }
    
}
 
// import java.io.FileOutputStream;  
// public class Q02
// {  
//     public static void main(String args[])
//     {    
//            try
//            {    
//              FileOutputStream fout=new FileOutputStream("Vishal.txt");    
//              fout.write(65);    
//              fout.close();    
//              System.out.println("success...");    
//             }
//             catch(Exception e)
//             {System.out.println(e);}    
//       }    
// }  
