import java.io.File;
import java.io.IOException;

public class Tut01
{
    public static void main(String[] args)
    {
      try
      {
          File Myobj = new File("File01.txt");
        if(Myobj.createNewFile())
        {
            System.out.println("File created : "+Myobj.getName());
        }
        else
        {
            System.out.println("File already exists.");
        }
      }
      catch(IOException e )
      {
          System.out.println("An Error occured.");
          //e.printStackTrace();
      }
      

    }
    
}
