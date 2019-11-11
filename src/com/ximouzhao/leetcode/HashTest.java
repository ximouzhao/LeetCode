package com.ximouzhao.leetcode;

public class HashTest {
    public static void main(String[] args) {
        int h=0b11111111111111111111111111111111;
        h ^= (h >>> 20) ^ (h >>> 12);
        h=h ^ (h >>> 7) ^ (h >>> 4);
    }
}
