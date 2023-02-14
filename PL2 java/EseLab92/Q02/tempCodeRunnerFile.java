public class Q02 
{
    public static void main(String[] args)
    {
        try
       {

        File fileobj = new File("Number.txt");
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
