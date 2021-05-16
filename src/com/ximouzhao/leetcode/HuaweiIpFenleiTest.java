package com.ximouzhao.leetcode;

import org.testng.annotations.Test;


public class HuaweiIpFenleiTest {

    @Test
    public void isMask() {
        HuaweiIpFenlei.isMask("255.254.27.0".split("\\."));
    }
}