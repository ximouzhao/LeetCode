package com.ximouzhao.leetcode;
import java.util.*;

public class Huawei2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int arr[]=new int[1001];
            int num=sc.nextInt();
            while(num>0){
                int data=sc.nextInt();
                arr[data]=1;
                num--;
            }
            for(int i=1;i<1001;i++){
                if(arr[i]==1){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
