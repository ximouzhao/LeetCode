package com.ximouzhao.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String patternStr=".*";
        Pattern pattern=Pattern.compile(patternStr);
        Matcher matcher=pattern.matcher("aaaa");
        System.out.println(matcher.matches());
        System.out.println(Pattern.matches(patternStr,"aaaa"));
        System.out.println(0b101101000);
        regex();

    }
    public static void  regex(){
        String regex = "[+\\-*/]";
        Pattern pattern = Pattern.compile(regex);
        String []nums = pattern.split("13+29-44*55/22");
        for (String num : nums) {
            System.out.println(num + " ");
        }
        String []nums1 = pattern.split("13+29-44*55/22",Pattern.CASE_INSENSITIVE);
        for (String num : nums1) {
            System.out.println(num + " ");
        }
    }
}
