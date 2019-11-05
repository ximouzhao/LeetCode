package com.ximouzhao.leetcode;

public class Question190 {
    public static void main(String[] args) {
        int i=1;
        int a=i>>1;
        System.out.println(i);
        System.out.println(a);
        System.out.println(1>>1);
        Integer.reverse(0b01010101010101010101010101010101);
    }
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int h=0;
        int a=32;
        while (a>0){
            h=h<<1|(n&1);
            n=n>>>1;
            a--;
        }
        return  n;
    }

}
