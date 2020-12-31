package programbase.test2;

interface MyInterface{
    final int MAX_SIZE=0;
}
public class MyInstanceTest implements MyInterface
{
    static String s;
    public static void main(String args[])
    {
        MyInstanceTest t = new MyInstanceTest();
        if(null instanceof String){
            System.out.println(11);
        }
        if(t instanceof MyInterface)
        {
            System.out.print("I am true interface");
        }
        else 
        {
            System.out.print("I am false interface");
        }
        if(s instanceof String)
        {
            System.out.print("I am true String");
        }
        else 
        {
            System.out.print("I am false String");
        }
    }
}
