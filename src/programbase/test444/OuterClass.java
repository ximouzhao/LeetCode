package programbase.test444;
public class OuterClass{
 private  double d1=1.0;
 //在这插入代码
 static class Test2222{

     static int xx;
     static public double test(){
         return 1;
     }
 }
    class Test{
        public double test(){
            return d1;
        }
    }
    public class Test3{
    }
    protected class Test4{
        public double test(){
            return d1;
        }
    }
    public abstract class Test5{
        public abstract double test();
    }
} 
