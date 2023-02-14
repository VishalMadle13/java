//01.  can we call run() method of a thread start().

class Mythread1 extends Thread
{
    @Override // here run method is overrides the 
              // so @override keyword is used for running the run() method

    public void run()
    {
        int i=0;
        while(i<5)
        {
             System.out.println("Thread 1");

            i++;
        }
    }
}

class Mythread2 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<5)
        {
            System.out.println("Thread 2");
            i++;

        }
    }
}

class Mythread3 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<5)
        {
            System.out.println("Thread 3");
            i++;

        }
    }
}

public class Q01
{
    public static void main(String[] args)
    {
        Mythread1 m1 =new Mythread1();
        Mythread2 m2 =new Mythread2();
        Mythread3 m3 =new Mythread3();

        m1.start();
        m2.start();
        m3.start();
    }    
}