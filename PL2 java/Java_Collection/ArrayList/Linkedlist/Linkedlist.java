import java.io.*;
import java.util.*;


public class Linkedlist 
{
    public static void main(String[] args)
    {
        LinkedList <Integer> LL = new LinkedList<Integer>();
        for(int i=0; i<5; i++)
        {
            LL.add(i);


        }
        System.out.print(LL+"\n");

        LL.remove(3);
        for(int i=0; i<LL.size(); i++)
        {
            System.out.println(LL.get(i)+" ");
        }

    }
}
