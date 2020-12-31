package programbase.test4;

public class Test21 {
    public static int a = 0;

    public static int modifyInt()
    {
        try
        {
            a++;
            throwException();
            a++;
            return a;
        }
        catch (Exception e)
        {
            a=2;
            return a;
        }
        finally
        {
            a=3;
        }
    }
    public static void throwException() throws Exception
    {
        throw new Exception("");
    }

    public static void main(String[] args) {
        ;
        System.out.println(modifyInt());
        System.out.println(a);
    }
}
