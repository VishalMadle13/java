import java.util.Scanner;
class Q2
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        try
        {
            int arr[]={1,2,3,4,5};
            System.out.println("Enter the value of a : ");
            int a= sc.nextInt();

            System.out.println("Enter the value of b : ");
            int b =sc.nextInt();

            System.out.println("Value of a/b is  : "+a/b);

            System.out.println("Enter value of index  : ");

            int index = sc.nextInt();
            System.out.println("Value at index " + index + " is " + arr[index]);
 
            int str = Integer.parseInt(sc.next());
            System.out.println(str/a);
 
            String s = null ;
 
            if (s.length() == 0) {
                System.out.println("Length of string is 0");
            }
 
        } 
        
        catch (ArithmeticException e)
         {
            System.out.println("Divison by zero is not allowed");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound");
        }
        catch(NumberFormatException e){
            System.out.println("Incorrect Number Format");
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
 
       






        
    }



    
}
