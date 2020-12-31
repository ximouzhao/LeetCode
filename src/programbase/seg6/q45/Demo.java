package programbase.seg6.q45;

public class Demo {

    public static void main(String[] args) {

        Demo demo = new Demo();

        new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (demo) {
                    System.out.println("before wait ");
                    try {
                        demo.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("after wait ");
                }
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (demo) {
                    System.out.println("before notify ");
                    demo.notify();
                    System.out.println("after notify ");
                }
            }
        }).start();

    }
}