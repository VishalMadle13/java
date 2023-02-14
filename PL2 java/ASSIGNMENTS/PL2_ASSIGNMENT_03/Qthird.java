
class Qthird
{
    public static void main(String[] args)
    {
        Outer out=new Outer();
        Outer.Inner obj1 =out.new Inner();
        Outer.staticInner obj2=new Outer.staticInner();

         obj2.increase();
         obj1.increase();
       

    }
}

class Outer
{
    static int n;
    int non=0;
    public static class staticInner
    {
        

        static int noOfObject;
        static void increase()
        {
            n++;
            System.out.println("n= "+n);
            noOfObject++;
            System.out.println("no of objects= "+noOfObject);

        }
    }


   class Inner
 {

   
    int noOfObject=0;
    void increase()
    {
        non++;
        System.out.println("non="+non);
        noOfObject++;
        System.out.println("no. of Object = "+noOfObject);

    }
 }
}


