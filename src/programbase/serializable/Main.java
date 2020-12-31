package programbase.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        try (//创建一个ObjectOutputStream输出流
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("circle.txt"))) {
            //将对象序列化到文件s
            Circle circle = new Circle();
            circle.color=555;
            circle.name="yuan";
            oos.writeObject(circle);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (//创建一个ObjectInputStream输入流
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("circle.txt"))) {
            Circle brady = (Circle) ois.readObject();
            System.out.println(brady);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
