package question4;

public class Foo {
public static void main(String args[]) {
    int i=1,j=10;
    do{
 if(i++>--j) continue;
    }while(i<5);
    System.out.println(i);
    System.out.println(j);


    int index = 1;
    int foo[] = new int[3];
    int bar = foo[index];
    int baz = bar + index;
    System.out.println( baz);


    try {
    return ;
   } finally {
    System.out.println("Finally");
   }
}}
