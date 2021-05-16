package com.ximouzhao.leetcode.huaweiHJ28;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MainTest {

    @Test
    public void isSushu() {
        Assert.assertTrue(Main.isSushu(2));
        Assert.assertFalse(Main.isSushu(4));
        Assert.assertFalse(Main.isSushu(12));
        Assert.assertTrue(Main.isSushu(17));
    }
    @Test
    public void getSushuBanLvCount1() {
        int[] test1=new int[]{5,6};
        List<Integer> list=Arrays.stream(test1).boxed().collect(Collectors.toList());
        Assert.assertEquals(Main.getSushuBanLvCount(list),1);
    }

    @Test
    public void getSushuBanLvCount() {
        int[] test1=new int[]{2,5,6,13};
        List<Integer> list=Arrays.stream(test1).boxed().collect(Collectors.toList());
        Assert.assertEquals(Main.getSushuBanLvCount(list),2);
    }

    @Test
    public void getSushuBanLvCount2() {
        int[] test1=new int[]{2,5,6,1,3,8};
        List<Integer> list=Arrays.stream(test1).boxed().collect(Collectors.toList());
        Assert.assertEquals(Main.getSushuBanLvCount(list),3);
    }

    @Test
    public void getSushuBanLvCount3() {
        int[] test1=new int[]{2,5,6,1,3,8,20,36};
        List<Integer> list=Arrays.stream(test1).boxed().collect(Collectors.toList());
        Assert.assertEquals(Main.getSushuBanLvCount(list),3);
    }

    @Test
    public void getSushuBanLvCount5() {
        int[] test1=new int[]{2,5,6,1,3,8,20,36};
        List<Integer> list=Arrays.stream(test1).boxed().collect(Collectors.toList());
        Assert.assertEquals(Main.getSushuBanLvCount(list),3);
    }
    @Test
    public void getSushuBanLvCount6() {
        int[] test1=new int[]{2,4,6,13};
        List<Integer> list=Arrays.stream(test1).boxed().collect(Collectors.toList());
        Assert.assertEquals(Main.getSushuBanLvCount(list),1);
    }


}