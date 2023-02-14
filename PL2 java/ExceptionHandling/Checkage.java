import java.util.*;



public class Checkage 
{
    public static void age()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int a= sc.nextInt();
         
        if(a<18)
        {
            throw new ArithmeticException("Access denied- You must be at least 18");
        }
        //.out.println("Access Denied!!");
        else
        {
            System.out.println("Access granted !!");
        }
      

       
    }

    public static void main(String[] args)
    {
        age();
    }
    
}
