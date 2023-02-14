import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.Soundbank;

public class Arraylist01
{
    public static void main(String [] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(1);
        a.add(3);
        a.add(2,2);
        a.add(34);
        a.add(324);

        System.out.println("Printing list by for loop : ");
         
        for(int i=0; i<a.size(); i++)
        {
            System.out.println(a.get(i));
        }
System.out.println("Printing list by Iterator method");
         
          Iterator it = a.iterator();

          while(it.hasNext())
          {
              System.out.println(it.next());
          }


     a.remove(3);
     



          System.out.println("Printing list by for loop : ");
         
        for(int j=0; j<a.size(); j++)
        {
            System.out.println(a.get(j));
        }
System.out.println("Printing list by Iterator method");
         
          Iterator it2 = a.iterator();

          while(it2.hasNext())
          {
              System.out.println(it2.next());
          }

          System.out.println("hii");

          for(int num : a)
          {
              System.out.println(a);
          }




          ArrayList<String> ar  = new ArrayList<String>();
          
          ar.add("Str1");
          ar.add(1, "324cd");

          System.out.println(ar);


        
    }
}
