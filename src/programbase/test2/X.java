package programbase.test2;

public class X {
    public static void main(String[] args)
    {
        int[] arrayVal = new int[2];
        int intVal = 4;

        test(arrayVal, intVal);

        System.out.print(arrayVal[0]);
        System.out.print(arrayVal[1]);
        System.out.print(intVal);
    }

    static void test(int[] arrayVal, int intVal)
    {
        arrayVal[0] = intVal;
        intVal = arrayVal[1];
    }

}
