import java.util.*;

public class Qfourth 
{
    public static void main(String[] args)
    {
        final int speedlimit=100;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Entered the speed");

        int speed =sc.nextInt();
        if(speed>speedlimit)
        {
            System.out.println("speed Limit is Exceeded!!");
        }

    }

}
