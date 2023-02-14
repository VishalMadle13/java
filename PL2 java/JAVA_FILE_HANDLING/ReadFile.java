import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile
{
    public static void main(String[] args)
    {
       try
       {

        File fileobj = new File("File01.txt");
        Scanner myReader = new Scanner(fileobj);
while(myReader.hasNextLine())
{
    String data = myReader.nextLine();

    System.out.println(data);
}

myReader.close();
        
       }

       catch(FileNotFoundException e)
       {
           System.out.println("Error");
           e.printStackTrace();

       }
    }
}
