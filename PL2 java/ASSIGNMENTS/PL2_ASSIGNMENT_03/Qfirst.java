import java.util.Scanner;
 
class Qfirst
{
    public static void main(String[] args)
    {
        Scanner inpt= new Scanner (System.in);

        Sphere s1=new Sphere();
        
        System.out.println("Enter the radius  : ");
        int radius1=inpt.nextInt();
        double Area=s1.Area(radius1);
        double Volume = s1.Volume(radius1);

        System.out.println("Area of Sphere   : "+Area+" metersquare");
        System.out.println("Volume of sphere : "+Volume+" metercube");
    }

       
}

class Sphere
{
    

    double Area(int rad)
    {
        return 4*3.14*rad*rad;
    }
    double Volume(int rad)
    {
        return 4*3.14*rad*rad/3;
    }
    
}