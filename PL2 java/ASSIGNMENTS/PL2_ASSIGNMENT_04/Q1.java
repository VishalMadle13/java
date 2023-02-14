import java.util.*;


class Q1 
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("hivkxlb");

        try
        {
            int a=5 ;
            int b=0 ;
            System.out.println(a/b);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed");

        }

        try
        {
            int arr[]= {1,2,3,4,5};
            System.out.println("Value at index 10 is "+arr[10]);
        }

        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of Bound");
        }


        try
        {
            System.out.println("Enter a number : ");
            int str =  Integer.parseInt(sc.next());
            int a=10;
            System.out.println(str/a);

        }

        catch(NumberFormatException e)
        {
            System.out.println("Incorrect Number Format");

        }

        try
        {
            String a= null;
            if(a.length()==0)
            {
                System.out.println("Length of string is 0");

            }
        }    
        
        catch(NullPointerException e)
         {
       System.out.println("Null pointer exception ");
         }
    

    }       







    
    
}
