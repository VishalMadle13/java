import java.util.ArrayDeque;

public class arraydeque01
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.add(1);
        ad.add(2);
        ad.addFirst(4);
        ad.addLast(5);
        System.out.println(ad);
        
        for(int i=0; i<5; i++)
        {
            ad.add(i);

        }
        System.out.println(ad);
        System.out.println(ad.peek());
        ad.add(5);
        System.out.println(ad.getLast());
        System.out.println(ad.poll());
    }
    
}
