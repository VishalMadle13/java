import javax.print.event.PrintJobListener;

public class ForEachLoop
{
    public static void main(String[] args)
    {
        String[] cars= {"BMW","AUDI",
        "FORD","Volvo","Mazda"};
        for(String i : cars)
        {
            System.out.println(i);
        }

        int num[]={1,2,3,4,5,6,7,8,9,0};
        for(int i : num)
        {
            System.out.println(i);

            //System.out.println(num[i]);
        }
        System.out.println("hiii\n"+cars);
        return;
    }
    
}
