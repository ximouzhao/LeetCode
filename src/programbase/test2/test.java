package programbase.test2;

import java.util.Vector;

public class test {
    public static Vector getvectorData(int ivalue1, int ivalue2) {
        Vector resultVec = new Vector();
        resultVec.add(new Integer(ivalue1));
        resultVec.add(new Integer(ivalue2));
        return resultVec;
    }

    public static void main(String args[]) {
        Vector vect = getvectorData(1, -200);
        for (int i = 0, len = vect.size(); i < len; i++) {
            System.out.println(vect.get(i));
        }
    }
}
