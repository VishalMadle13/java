//package MultiThreading;
// incomplete
!!
// !!
// !!

public class Mt02  implements Runnable
{


    public void run()
    {
        int i=0;
         while(i<5)
         {
            System.out.println("111111111111111");
            i++;
         }
    }



    public static void main(String[] args) 
    {


        
        
        System.out.println("ssdff");
        MultiThreadingRunnable1 m1 = new MultiThreadingRunnable1();
        Thread t1 = new Thread(m1);

        MultiThreadingRunnable2 m2 = new MultiThreadingRunnable2();
        Thread t2 = new Thread(m2);

        t1.start();
        try
        {
            t1.join();

        }
        catch(Exceptione e)
        {
            System.out.println(e);
        }

        t2.start();


    }
    
}

class MultiThreadingRunnable1 
{
    public void run()
    {
        int i=0;
         while(i<5)
         {
            System.out.println("111111111111111");
            i++;
         }
    }
}
class MultiThreadingRunnable2
{
    public void run()
    {
        int i=0;
         while(i<5)
         {
            System.out.println("0000000000000");
            i++;
         }
    }
}


 