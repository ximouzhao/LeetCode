package com.ximouzhao.leetcode;

import java.util.Scanner;

public class Huawei3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLine()){
            int a=0;
            String s=sc.nextLine();
            s=s.substring(2);
            int length=s.length();
            int powresult=1;
            for(int i=length-1;i>=0;i--){
                char c=s.charAt(i);
                if(c>='0'&&c<='9')
                {
                    a+=(c-'0')*powresult;
                }else if(c>='A'&&c<='F'){
                    a+=(c-'A'+10)*powresult;
                }
                powresult=powresult*16;
            }
            System.out.println(a);
        }
    }
}
