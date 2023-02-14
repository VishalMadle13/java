import java.util.*;

public class Pqueue 
{
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq =new PriorityQueue<Integer>();

        pq.add(2);
        pq.add(3);
        pq.add(7);
        pq.add(6);

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
    

