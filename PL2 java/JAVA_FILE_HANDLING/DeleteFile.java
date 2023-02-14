import java.io.File;


public class DeleteFile
{
    public static void main(String[] args)
    {
        File obj =new File("File01.txt");
        if(obj.delete())
        {
            System.out.println("Deleted the file : "+obj.getName());
        }
        else
        {
            System.out.println("Failed to delete the file");
        }

    }
}
