package programbase.timecosttime;

public class student
{
    
    String id;
    int salary;
    public void changInfo(String id, int salary)
    {
        boolean result;
        if (id == this.id)
        {
            this.salary = salary;
            result = true;
        }
        else
        {
            result = false;
        }
    }
    private static int a;
    public static void modify(int a){
        a++;
    }
    public final static void main(String args[]) {
        modify(a);
        System.out.println(a);
        short s=1;
        s= (short) (s+1);
        s+=1;
        String str[]=new String[3];
        String str2[];
        String str3[]={"String"};
        String []str4={"String"};
        int []a={333};

        int i=1;int j;j= i++;
        System.out.println(i);
        System.out.println(j);
        float []f[]=new float[6][6];
        float [][]f2=new float[6][];
        int b;
        System.out.println(a);
        f.clone();
         System.out.println(Math.floor(11.5));
        System.out.println(Math.floor(-11.5));
        System.out.println(Math.round(-11.5));
    }
}
