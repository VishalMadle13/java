//package Java_Collection;
import java.util.*;

public class Arraylist 
{
   public static void main(String[] args)
   {
       ArrayList<Integer> al = new ArrayList<Integer> ();
       //appending the new elements in the array 
       for (int i=0; i<5; i++)
       {
           al.add(i);
        // 

       }
          al.remove(0);
          System.out.println(al);

       for(int i=0; i<al.size(); i++)
       {
           System.out.println(al.get(i) +"\n");
       }
       
       
       

   } 
}
