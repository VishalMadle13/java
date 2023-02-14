import java.util.Iterator;
import java.util.LinkedList;

import javax.xml.transform.SourceLocator;

public class lnklst01
{
    public static void main(String[] args) 
    {
        LinkedList l = new LinkedList<>();
        l.add("vishal");
        l.add("aman");
        l.add("sudesh");
        l.add("sai");
        l.add("pranit");

        System.out.println(l.get(2));
        System.out.println(l);
        System.out.println(l.size());
        

        //using iterator
        Iterator<String> it01 = l.iterator();
        while(it01.hasNext())
        {
            System.out.println("list: "+it01.next());
        }

        Iterator it02 = l.descendingIterator();
        while(it02.hasNext())
        {
            System.out.println(it02.next());
        }
        
    }
    
}
