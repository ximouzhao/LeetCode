package programbase.test1;

class HasStatic {

    private static int x = 100;

    public static void main(String args[]) {
        byte x=111;
        double y=3.3;
        System.out.println((short)x/y*2);

        HasStatic hs1 = new HasStatic();

        hs1.x++;

        HasStatic hs2 = new HasStatic();

        hs2.x++;

        hs1 = new HasStatic();

        hs1.x++;

        HasStatic.x--;

        System.out.println("x=" + x);

    }

}
