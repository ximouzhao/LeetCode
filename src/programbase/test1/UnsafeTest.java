package programbase.test1;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeTest {
    private final static Unsafe UNSAFE;
    // 只能通过反射获取Unsafe对象的实例
    static {
        try {
            UNSAFE = (Unsafe) Unsafe.class.getDeclaredField("theUnsafe").get(null);
        } catch (Exception e) {
            throw new Error();
        }
    }

    public static void main(String[] args) {
        Field[] fields = Integer.class.getDeclaredFields();
        for (Field field:fields) {
            System.out.println(field.getName() + "---offSet:" + UNSAFE.objectFieldOffset(field));
        }
    }


}
