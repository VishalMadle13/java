//Q3:Write  a program to display Thread information.

//
wrong
!!
!!
!!
!!
!!!


public class Q03 implements Runnable
{
    public void run()
    {
        System.out.println("thread is running");
    }


    public static void main(String[] args)
    {
       
        Thread t1 = new Thread(new Q03());
        t1.start();


        // Thread t2 = new thread(new Q03());
        // t2.start();






    }
}
