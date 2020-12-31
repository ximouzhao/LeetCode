package programbase.classdemo;

public class ClassDemo {

    public static int sum = 1;

    protected static void method(Integer i) {
        System.out.println(i);
    }

    public ClassDemo() {

        sum = sum + 5;

    }

}