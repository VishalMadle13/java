import java.util.Scanner;

class MinBalanceExecption extends Exception
{ 
    public String toString()
    {
        return "Your balance is smaller!!";
    }
}
public class Minbalance 
{
    

    static void checkBal()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the balance : ");
        int b= sc.nextInt();
        
        try
        {
            if(b<5000)
            {
                throw new MinBalanceExecption();
            }
            else
            {
                System.out.println("Welcome");
            }
        }

        catch(MinBalanceExecption e)
        {
            e.printStackTrace();
        }

    }
    public static void main(String[] args)
    {
       checkBal();
    }

    
}
