import java.util.*;

class Q3
{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args)
    {
         
        try {
            try {
                try {
                    int a = 5 ;
                    int b = 0 ;
                    System.out.println(a/b);
                } catch (ArithmeticException e) {
                    System.out.println("Divison by zero is not allowed");
                }

                int arr[] = {1,2,3,4,5} ;
            System.out.println("Value at index 10 is " + arr[10]);
            } catch(IndexOutOfBoundsException e){
                System.out.println("Array Index Out Of Bound");
            }

            System.out.println("Enter a number : ");

            int str = Integer.parseInt(sc.next());
            int a = 10 ;
            System.out.println(str/a);
        }  catch(NumberFormatException e){
            System.out.println("Incorrect Number Format");
        }
        finally {
            System.out.println("Program Executed !!!");
        }

    }

    
}
