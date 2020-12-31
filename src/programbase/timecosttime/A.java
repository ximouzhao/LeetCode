package programbase.timecosttime;

interface A {
    public static final int x = 0;
}

class B {
    public static final int x = 1;
}

class C extends B implements A {
    public static final int x = 1;
    public void pX() {
        System.out.println(x);
    }

    public static void main(String[] args) {


            boolean isValid = false;
            int[] scores =new int[]{65,70,69,98,86};
            if (true)
            {
                System.out.println(scores[3]);
            }
            else
            {
                System.out.println("No information");
            }

        new C().pX();
    }
}

