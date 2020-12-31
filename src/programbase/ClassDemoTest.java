package programbase;


import programbase.classdemo.ClassDemo;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class ClassDemoTest {


    public static void main(String args[]) {

        ClassDemo demo1 = new ClassDemo();

        ClassDemo demo2 = new ClassDemo();

        System.out.println(demo1.sum);
       // ClassDemo.method(2222);

    }
    public void getCustomerInfo() throws IOException {

        new BufferedWriter(new FileWriter("a.txt"));

        //new BufferedReader(new FileInputStream("a.dat"));

        new GZIPOutputStream(new FileOutputStream("a.zip"));

        new ObjectInputStream(new FileInputStream("a.dat"));

        try {
            File file=new File("/app/test");
            FileInputStream fis = new FileInputStream(file);
            // do something that may cause an Exception

        } catch (java.io.FileNotFoundException ex){

            System.out.print("FileNotFoundException!");

        } catch (java.io.IOException ex){

            System.out.print("IOException!");

        } catch (java.lang.Exception ex){

            System.out.print("Exception!");

        }

    }


}
