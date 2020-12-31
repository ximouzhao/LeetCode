package programbase.test1;

public class StaticStuff {
    static int x = 1;
    {
        x=2;
    }
    static {
        x =3;
    }
    public static void main( String args[]) {
        System.out.println("x =" + x);
        SubClass subClass=new SubClass();
        System.out.println("subClass x =" + subClass.x);
    }
    static {
        x = 4;
    }
}
class SubClass extends  StaticStuff{
    SubClass(){
        x=5;
    }
    static int x =9;
    {
        x=6;
    }
    static {
        x=7;
    }
    static {
        x =8;
    }
}