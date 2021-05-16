package com.ximouzhao.leetcode;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLine()){
            System.out.print(sc.nextInt());
            System.out.print("-"+sc.nextLine()+"-");
        }
    }
}
