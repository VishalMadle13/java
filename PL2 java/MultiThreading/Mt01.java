class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<5)
        {
                    System.out.println("studying .........");
                    i++;
        }
         
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<5)
        {
                    System.out.println("playing  .........");
                    i++;
                    

        }

    }
}




public class Mt01
{
    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
        
    }
}