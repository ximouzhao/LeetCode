package programbase.seg6.q45;

public class Test3 {
    public static void main(String[] args) {
        Thread t = new Thread()
        {
            @Override
            public void run()
            {
                while(true)
                {
                }
            }
        };
        t.start();
        t = null;

    }
}
