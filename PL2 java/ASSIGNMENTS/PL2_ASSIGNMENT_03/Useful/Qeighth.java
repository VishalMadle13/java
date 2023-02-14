import Useful.Useme;

public class Qeighth 
{
    public static void main(String[] args)
    {
        Useme obj =new Useme();
        double arC =obj.area("Circle", 3, 0);
        System.out.println("Area of circle : "+arC); 
        
        obj.area("Trapezium", 543, 54);

        float percent= obj.percentage(495, 500);
        
        System.out.println("Percentage : "+percent);


    }

    
}


 