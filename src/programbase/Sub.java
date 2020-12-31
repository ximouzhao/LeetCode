package programbase;

class Super {
    public int i = 0;


}

public class Sub extends Super {
    public Sub(String text) {
       i = 2;
    }

    public static void main(String args[]) {
        Super sui = new Sub("Hello");
        System.out.println(sui);
    }
}
