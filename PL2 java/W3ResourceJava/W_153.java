import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

//153. Write a Java program that accepts two double
// variables and test if both strictly between 0 and 1 and 
//false otherwise
public class W_153
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double  fnum,snum;
        
        
        System.out.println("Enter the first number  : ");
        fnum=sc.nextDouble();

        System.out.print("Enter the second number  : ");
        snum=sc.nextDouble();


        if((fnum>0 && snum>0)&&(fnum<1&&snum<1))
        {
            System.out.println("true");
        }
        else
        {
            System.out.print("false");
        }





    }

    
}
