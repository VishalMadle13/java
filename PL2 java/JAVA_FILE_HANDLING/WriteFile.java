import java.io.FileWriter;
import java.io.IOException;

public class WriteFile 
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter wr = new FileWriter("File01.txt");
            wr.write("Hello everyone my name is vishal ");
            wr.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(IOException e)
        {
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
    
}
