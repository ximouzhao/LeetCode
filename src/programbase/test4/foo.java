package programbase.test4;

public class foo
{
    public void trythis()
    {
        try
        {
            System.out.print("1");
            problem();
        }
        catch (RuntimeException x)
        {
            System.out.print("2");
            return;
        }
        catch (Exception x )
        {
            System.out.print("3");
            return;
        }
        finally
        {
            System.out.print("4");
        }
        System.out.print("5");
    }

    private void problem() throws Exception
    {
        throw new Exception();
    }

    public static void main (String[]args)
    {
        new foo().trythis();
        try 
        {
            return;
        }finally 
        {
            System.out.println("Finally");
        }
    }
}
