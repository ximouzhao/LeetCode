package programbase.test3;

public class Main {
    public static void main(String[] args)
    {
        String str1 = "java";
        StringBuffer str2 = new StringBuffer(str1);

        replace(str1);
        replace(str2);

        System.out.println(str1 + "," + str2);
    }

    private static void replace(String str1)
    {
        str1.replace('a', 'b');
    }

    private static void replace(StringBuffer str2)
    {
        int index = str2.indexOf("a");

        while (index > 0)
        {
            str2.setCharAt(index, 'b');
            index = str2.indexOf("a", index);
        }
    }

}
