package programbase.test1;

public class Test2 {
    public static void main(String[] args) {
        int b;
        int a = b = 5;

        String s1 = "祝你今天考出好成绩！";

        String s2 = s1;
        System.out.println(a==b);
        System.out.println(s2==s1);
    }
}
