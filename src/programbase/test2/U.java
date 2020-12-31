package programbase.test2;

import java.awt.Point;

public class U {
    public static void main(String[] args)
    {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);

        modifyPoint(p1, p2);

        System.out.println("[" + p1.x + "," + p1.y + "], [" + p2.x + "," + p2.y + "]");
    }
    static int  test(boolean condition)
    {
        int intZero = 0;
        char charZero = '0';
        System.out.print(intZero + charZero);

        try
        {
            return condition ? 0 : 1;
        }
        finally
        {
            return 2;
        }
    }


    private static void modifyPoint(Point p1, Point p2)
    {
        System.out.println(test(true));
        Point tmpPoint = p1;
        p1 = p2;
        p2 = tmpPoint;

        p1.setLocation(5, 5);
        p2 = new Point(5, 5);
    }

}
