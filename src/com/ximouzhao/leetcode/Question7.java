package com.ximouzhao.leetcode;


public class Question7 {
    public static void main(String[]args){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE%10);
        System.out.println(Integer.MIN_VALUE%10);
    }
    public int reverse(int x) {
        int rev=0;
        while (x!=0){
            int pop=x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10|| rev==Integer.MAX_VALUE/10&&pop>7){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10||rev==Integer.MIN_VALUE/10&&pop<-8){
                return 0;
            }
            rev=rev*10+pop;
        }
        return rev;
    }
}
