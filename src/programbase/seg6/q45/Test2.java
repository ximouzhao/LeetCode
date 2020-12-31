package programbase.seg6.q45;

class A {
    String name() {
        return "A;";
    }
}

class B extends A {
    @Override
    String name() {
        return "B;";
    }
}

class C extends A {
    @Override
    String name() {
        return "C;";
    }
}

public class Test2 {

    public static void main(String[] args) {
        System.out.println(9*0.1);
        System.out.println(1.00 - 9*0.1);
        System.out.println(1 - 0.9);
        System.out.println(1.00 - 0.9);
        A[] a = new A[] {
            new A(), new B(), new C()
        };

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].name());
        }
    }
}
