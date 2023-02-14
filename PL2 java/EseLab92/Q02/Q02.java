import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 public class Q02 
{
    public static void main(String[] args)
    {
        
        try
       {

        File fileobj = new File("Number.txt");
        Scanner myReader = new Scanner(fileobj);
        int countp=0;
        int countn=0;
        while(myReader.hasNextInt())
       {
          int data = myReader.nextInt();
          
          if(data>=0)
          {
            
              countp=countp+1;

          }
          else if(data<0)
          {
              
              countn=countn+1;
          }
         


          //System.out.println(data);
         
          
       } 
       System.out.println("The number of  positive values are :"+countp);
       System.out.println("The number of  negative values are :"+countn);
    

        myReader.close();
        
       }

       catch(FileNotFoundException e)
       {
           System.out.println("Error");
           e.printStackTrace();

       }
    }
}

        
    