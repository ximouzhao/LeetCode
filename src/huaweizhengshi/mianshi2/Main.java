package huaweizhengshi.mianshi2;

public class Main {
    public static void main(String[] args) {
        Integer input=0b10100100;
        Integer toCheck=0b10100000;
        for(int i=0;i<6;i++){
            int value=toCheck&input;
        }
    }
}
