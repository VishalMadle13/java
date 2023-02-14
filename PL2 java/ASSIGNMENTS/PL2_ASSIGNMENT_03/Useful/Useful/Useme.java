 package Useful;

public class Useme
{
    public double area(String shape, int length,int breadth)
    {
        if(shape=="Square")
        {
            return length*length;
        }
        
        else if(shape=="Rectangle")
        {
            return length*breadth;
        }

        else if(shape=="Circle")
        {
            return 3.14*length*length;
        }

        else if(shape=="Triangle")
        {
            return length*breadth/2;
        }

        else
        {
            System.out.println("Shape is not listed in the function !!!");
            return 0;
        }

    }

    public Float percentage(int marks_obt, int total_marks)
    {
        return (float) (marks_obt*100/total_marks);
    }
}
