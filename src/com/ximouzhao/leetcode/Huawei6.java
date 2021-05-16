package com.ximouzhao.leetcode;

import java.util.Scanner;
import java.util.TreeSet;

public class Huawei6 {
    public static void main(String argv[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            TreeSet<Character> ts=new TreeSet();
            int length=str.length();
            for(int i=0;i<length;i++){
                Character c=str.charAt(i);
                //ts.
            }
            for(char c:ts){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
