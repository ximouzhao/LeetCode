package programbase.test1;

public class TestAAASub extends TestAAA implements TestBBB {

    @Override
    public void run() {
        System.out.println("TestBBB");
    }

    public static void main(String[] args) {
        TestAAASub testAAASub=new TestAAASub();
        testAAASub.run();

        TestAAA testAAA=new TestAAASub();
        testAAASub.run();
    }
}