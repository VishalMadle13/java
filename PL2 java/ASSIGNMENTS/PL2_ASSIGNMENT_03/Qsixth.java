

public class Qsixth 
{
    public static void main(String[] args)
    {
        SubClass C = new SubClass();
        C.non_method();
        C.a_method();
    }

}

abstract class Abstracted
{
    Abstracted()
    {
        System.out.println("This is constructor of abstract class ");
    }
    public abstract void a_method();
    public void non_method()
    {
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends Abstracted
{
    public void a_method()
    {
        System.out.println("This is abstract method");
    }
}