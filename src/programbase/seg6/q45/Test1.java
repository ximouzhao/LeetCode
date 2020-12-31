package programbase.seg6.q45;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1
{
    
    public static String getString(Set s)
    {
        return "Set;";
    }

    public static String getString(List l)
    {
        return "List;";
    }

    public static String getString(Collection c)
    {
        return "Collection;";
    }
    
    public static void main(String[] args)
    {
      Collection[] c1 = new Collection[]{
          new HashSet(),
          new ArrayList(),
          new HashMap().values()
      };
        System.out.print(getString(new HashSet()));
        System.out.print(getString(new ArrayList()));
        System.out.print(getString(new HashMap().values()));
      for(int i=0; i<c1.length; i++)
      {
          System.out.print(getString(c1[i]));
      }
    }
}
