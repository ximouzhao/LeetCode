package programbase.test4;

public class Test6 {
    public static void main(String[] args) {
        int i=0,j=0;
        while(true)
        {
            if(i++==4 || j++==4)
            {
                break;
            }
        }
        System.out.println(i+" "+j);
        System.out.println(4|7);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(true);
        if (b1 == b2)
        {
            if (b1.equals(b2))
            {
                System.out.println("a");
            }
            else
            {
                System.out.println("b");
            }
        }
        else
        {
            if (b1.equals(b2))
            {
                System.out.println("c");
            }
            else
            {
                System.out.println("d");
            }
        }
        String str = null;
        if (str != null & str.length() >0)
        {
            System.out.println("str is NOT empty");
        }
        else
        {
            System.out.println("str is empty");
        }


        final int ii=0;
        long l=0;
        short s=333;
        byte b=33;
        char c='c';
        switch (ii){
            case 333:
                ;


        }

    }
}
