// 4. Write a program in java 
//for handling exceptions with nested try block. 
import java.util.*;

class Q4
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] arrgs)
    {
        try
        {
            try
            {
                try
                {
                    int a=5;
                    int b=0;
                    System.out.println(a/b);

                }

                catch(ArithmeticException e)
                {
                    System.out.println("Division by zero is not allowed ");
                }

                int arr[]={1,2,3,4,5};
                System.out.println("value at index 10 is  "+arr[10]);
            }

            catch(IndexOutOfBoundsException e)
            {
                System.out.println("Array Index out of bound ");
            }
            System.out.println("Enter a number ");
            
            int str = Integer.parseInt(sc.next());
            int a =10;

            System.out.println(str/a);


        }

        catch(NumberFormatException e)
        {
            System.out.println("Incorrect number format ");
        }


        finally
        {
            System.out.println("program Executed !!!");
        }
    }

    
}
