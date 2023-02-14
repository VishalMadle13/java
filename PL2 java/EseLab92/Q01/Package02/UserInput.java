import java.util.Scanner;

import java.util.*
;
public class UserInput 
{


    
    public static void main(String[] args)
    {
         Scanner sc =new Scanner(System.in);
        int num;
         System.out.println("Enter the any number : ");
         num = sc.nextInt();
        //System.out.println("successfull ");

        if(num==0)
        {
            System.out.println("\nThe ented number is zero ");
            
        }
        else if(num!=0)
        {
            System.out.println("\nThe entered number is not zero");
        }



    }
}
