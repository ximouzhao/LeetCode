package programbase.seg6.q45;

public class TestThread
{
    double commonVal = 0;
    volatile double volatileVal = 0;
    double synchronizedVal = 0;   

    void testCommonVal(int i)
    {
        commonVal = commonVal + i;
    }

    void testVolatileVal(int i)
    {
        volatileVal = volatileVal + i;
    }

    synchronized void testSynchronizedVal(int i)
    {
        synchronizedVal = synchronizedVal + i;
    }

    public static void main(String[] args) throws InterruptedException {
        TestThread testThread=new TestThread();
        testThread.doTest();
        Thread.sleep(5000);
        System.out.println(testThread.commonVal);
        System.out.println(testThread.volatileVal);
        System.out.println(testThread.synchronizedVal);

    }
    void doTest()
    {
        class Runner implements Runnable
        {
            @Override
            public void run()
            {
                for(int i = 0; i < 5000000; i++) //500万次 
                {
                    testCommonVal(i);
                    testVolatileVal(i);
                    testSynchronizedVal(i);

                    testCommonVal(-i);
                    testVolatileVal(-i);
                    testSynchronizedVal(-i);
                }
            }
        }

        //启动两个线程调用三个 test 方法 
        new Thread(new Runner()).start();
        new Thread(new Runner()).start();
    }
}
