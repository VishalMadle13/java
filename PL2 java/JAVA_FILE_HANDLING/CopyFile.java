import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
public class CopyFile 
{
    public static void main(String[] args)  throws Exception
    {
        Scanner sc = new Scanner(System.in);

         

        
        System.out.println("Enter the file name from which data has to be copy : ");
        String Sflie = sc.nextLine();

        System.out.println("Enter the file name in which data has to copied : ");
        String Dfile =sc.nextLine();
         

        FileReader fin = new FileReader(Sflie);
        FileWriter fout = new FileWriter(Dfile);


        int c;
        while( (c=fin.read())!=-1)
        {
            fout.write(c);


        }
        fin.close();
        fout.close();

        System.out.println("File is copied successfully ");
        
    }
    
}
