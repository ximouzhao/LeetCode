package question4;

class X {
public static int getNumber(int a) {
   return a + 1;
}
}


public class B extends X {
public static int getNumber(int a) {
   return a + 2;
}

public static void main(String[] args) {
   B b = new B();
   System.out.println(b.getNumber(0));
}
}
