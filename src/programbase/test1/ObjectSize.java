package programbase.test1;
import java.lang.instrument.Instrumentation;
 
public class ObjectSize {
    private static volatile Instrumentation instru;
 
    public static void premain(String args, Instrumentation inst) {
        instru = inst;
    }
 
    public static Long getSizeOf(Object object) {
        if (instru == null) {
            throw new IllegalStateException("Instrumentation is null");
        }
        return instru.getObjectSize(object);
    }

    public static void main(String[] args) {
        String s="999999999";
        System.out.println(getSizeOf(s));

    }
}