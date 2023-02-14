import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

//7.	Write Java program to delete a file.
public class Q07
{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("Vishal04.txt");
            
            if(f.delete())
            {
                System.out.println("Successfully deleted the file !!");

            }
            else
            {
                System.out.println("!! Error occured on deletion of file ");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
           
        }
        
    }
    
}
