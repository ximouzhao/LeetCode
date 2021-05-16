package com.leetcode495;


import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void findPoisonedDuration() {
        int returnValue=new Solution().findPoisonedDuration(new int[]{1,4},2);
        System.out.println(returnValue);
    }
}