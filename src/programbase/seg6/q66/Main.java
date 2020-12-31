package programbase.seg6.q66;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args)
    {
        Vector vector = new Vector();
        vector.add("One");
        vector.add("two");
        vector.add("three");
        vector.add("four");

        for (Iterator iter = vector.iterator(); iter.hasNext();)
        {
            String item = (String) iter.next();

            if (item.equals("two"))
            {
                iter.remove();
            }
        }
        printList(vector);
    }

    private static void printList(List list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(String.valueOf(list.get(i)));

            if (i < (list.size() - 1))
            {
                System.out.print(",");
            }
        }

        System.out.println();
    }

}
