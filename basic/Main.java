import java.util.Scanner;

public class Main

{
    public static void main(String[] args)
    {
        System.out.println("hiii \nEnter any string");

        Scanner s0= new Scanner(System.in);
        
        String a=s0.nextLine();
        System.out.println("hiii \nEnter any Byte");
        byte b=s0.nextByte();
        System.out.println("hiii \nEnter any INT value");
        int c=s0.nextInt();


        
        System.out.println("\n\nyou entered the\nstring  : "+a);
        System.out.println("\nByte : "+b);
        System.out.println("\nInt  : "+c);

    }
}