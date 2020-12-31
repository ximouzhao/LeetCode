package programbase.timecosttime;

import java.io.*;

public class CS {
    public static void main(String args[]) {
        CS cs = new CS();
        cs.method();
    }

    public void method() {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("CS.java");
            int count = 0;
            while (fis.read() != -1) {
                count++;
            }
            System.out.println(count);
            fis.close();
        } catch (FileNotFoundException e1) {
            System.out.println(e1);
        } catch (IOException e2) {
            System.out.println(e2);
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
