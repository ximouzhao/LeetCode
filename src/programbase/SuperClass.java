package programbase;

public class SuperClass {
}

class SubClass extends SuperClass {
    public void test(SubClass foo) {
        SuperClass bar = foo;
    }

    public static void main(String[] args) {
        SubClass a=new SubClass();
        a.test(a);
    }
}
