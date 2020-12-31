package programbase.test1;

public class Conditional {

    public static void main(String args[]) {

//        for (int k = 0; k < 10; k--);
//        System.out.println("xxx");
        for (int k = 0; k !=0; k++){
            System.out.println(k);
        }
        System.out.println("222");

        int a=3;int c;
        if ( a>0 )

            if ( a>3 ) c = 2;

            else c = 3;

        else c = 4;
        System.out.println(c);



        c = 2;

        System.out.println(c);

        System.out.println(c++);

        System.out.println(c);

        String s1 = "a" + "b";

        String s2 = new String(s1);

        if (s1 == s2)

            System.out.println("= = is succeeded");

        if (s1.equals(s2))

            System.out.println(".equals() is succeeded");


        int x = 4;

        System.out.println("value is " + ((x > 4) ? 99.9 : 9));

    }

}
