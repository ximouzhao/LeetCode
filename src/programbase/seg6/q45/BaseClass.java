package programbase.seg6.q45;

import programbase.Sub;

class BaseClass {
    private float x = 1.0f;

    public float getVar() {
        return x;
    }
    public float test() throws RuntimeException{
        return getVar();
    }
}

class SubClass extends BaseClass {
    static class Test{
        static int y;
        int x;
    }
    private float x = 2.0f;

    @Override
    public float getVar() {
        return 2.0f;
    }

    public static void main(String[] args) {
        SubClass.Test test=new Test();
        Test.y=9;
        System.out.println(3/2);
        System.out.println(3<<2);
        BaseClass baseClass=new SubClass();
    }
} 
