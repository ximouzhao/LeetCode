package question4;

class EnclosingOne {
    public class InsideOne {
    }
}

public class InnerTest {
    public class InsideTwo {
    }
    public static void main(String args[]) {

        double d=Math.cos(Math.toRadians(0));
        System.out.println(d);
        EnclosingOne eo = new EnclosingOne();

        String foo="blue";
        boolean[] bar=new boolean[1];
        if(bar[0]){
         foo="green";
        }
        System.out.println(foo);

        int index=1;
        String[] test=new String[3];
        String foo1=test[index];
        System.out.println(foo1);



        //在这插入代码
        EnclosingOne.InsideOne insideOne=eo.new InsideOne();
        EnclosingOne.InsideOne ei=eo.new InsideOne();
        InnerTest innerTest=new InnerTest();
        InsideTwo insideTwo=innerTest.new InsideTwo();

    }
}
