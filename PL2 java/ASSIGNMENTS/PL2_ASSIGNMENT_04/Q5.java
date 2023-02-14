//Write a program in java for custom exception 
//to check speed of car on  highway, if speed
// exceeds 120Km/hr then throw a ‘Speed Limit 
//Exceeded’  exception. (use throw) 

import java.util.*;

class UserDefinedException extends Exception
{
    UserDefinedException(String s)
    {
        super(s);
    }
}
class Q5 
{
    static Scanner sc =new Scanner(System.in);

    public static void main(String[] args)
    {
        try 
        {
            System.out.println("Enter the speed of vehicle in kmph : ");
            int speed =sc.nextInt();

            if(speed > 120)
            {
                throw new UserDefinedException("Speed limit is Exceeded");

            }
            else
            {
                System.out.print("Speed is in limit !!");
            }


        }

        catch(UserDefinedException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
