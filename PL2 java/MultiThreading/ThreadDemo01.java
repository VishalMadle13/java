

public class ThreadDemo01 
{
    public static void main(String[] args)
    {
       Mythread01 t01 = new Mythread01("vishal");
       System.out.println("ID "+ t01.getId() );
       System.out.println("name"+t01.getName());
       System.out.println("Priority"+t01.getPriority());
       System.out.println("state "+ t01.getState());
       System.out.println("alive"+t01.isAlive());
       t01.setPriority(5);
       System.out.println("new priority "+t01.getPriority());
       t01.start();
       System.out.println("state"+t01.getState());
       System.out.println("Alive"+t01.isAlive());
       System.out.println("interrupted"+t01.isInterrupted());
       System.out.println("daemon"+t01.isDaemon());



    }
    
}

class Mythread01 extends Thread
{
    public Mythread01(String name )
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}