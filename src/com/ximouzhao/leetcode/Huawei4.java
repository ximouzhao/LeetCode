package com.ximouzhao.leetcode;

import java.util.Scanner;
import java.util.TreeSet;

public class Huawei4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int a=sc.nextInt();
            a=a>1000?1000:a;
            int []arr=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=i;
            }
            TreeSet<Character> ts=new TreeSet();
            int length=a;
            int num=a-1;
            while (length>1){
                int count=0;
                while (count<3){
                    num++;
                    num=num%a;
                    while (arr[num]==-1){
                        num++;
                        num=num%a;
                    }
                    count++;
                }
                length--;
                arr[num]=-1;
            }
            for(int i=0;i<a;i++){
                if(arr[i]!=-1){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
