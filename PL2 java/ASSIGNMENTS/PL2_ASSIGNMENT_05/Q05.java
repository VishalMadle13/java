import java.io.FileInputStream;
import java.io.FileWriter;
//5.	Write Java program to append text/string in a file.

import java.io.File;
import java.io.*;

public class Q05
{
    public static void main(String[ ] args)
    {
        try
        {
            File f1 = new File("Vishal03.txt");
            if(!f1.exists())
            {
                f1.createNewFile();
            }
            FileWriter fwin = new FileWriter(f1.getName(),true);
            BufferedWriter bwin =new BufferedWriter(fwin);

            bwin.write("computer science : this is appended text in file");

            bwin.close();


        
        System.out.println("Successfully appended text in file ");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
