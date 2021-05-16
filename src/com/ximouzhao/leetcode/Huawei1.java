package com.ximouzhao.leetcode;
import java.util.*;

public class Huawei1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            if(num==0){
                return;
            }
            System.out.println(caculate(num));
        }
    }
    public static int caculate(int num){
        if(num<2){
            return 0;
        }
        if(num==2){
            return 1;
        }
        int a=num/3;
        return a+caculate(a+num%3);
    }
}
