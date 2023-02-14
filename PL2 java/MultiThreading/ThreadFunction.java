public class ThreadFunction 
{
    public static void main(String[] args) 
    {
        even e = new even();
        odd o = new odd(); 

        e.start();
        try
        {
            Thread.sleep(10);
        }
        catch(Exception ex)
        {

        }

        // e.start();
o.start();

        // e.join();
        // try
        // {
        //     Thread.sleep(10);
        // }
        // catch(Exception ex)
        // {

        // }
        // o.join();
        //   try
        // {
        //     Thread.sleep(10);
        // }
        // catch(Exception ex)
        // {


        // }
        System.out.println(e.isAlive());
        System.out.println("bye");

        
    }
    
}

class even extends Thread
{
   public void run()
   {
       for(int i=1; i<=20;i++)
       {
           if(i%2==0)
           {
               System.out.println(i+"Even Thread");
           }
           try
           {Thread.sleep(1000);}
           catch(Exception e)
           {
               
           }
       }
   }
}

class odd extends Thread
{
    public void run()
    {
        for(int i=1; i<=20;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i+"odd Thread");
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }
        }
    }
}