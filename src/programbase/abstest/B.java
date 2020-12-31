package programbase.abstest;

class A
{
    public A()
    {
        System.out.print("a");
    }
}

public class B extends A
{
    public B()
    {
         System.out.print("b");
    }
    
    public static void main(String[] args)
    {
        A a = new B();
    }
}
