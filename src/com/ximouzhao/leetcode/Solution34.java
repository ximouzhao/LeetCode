package com.ximouzhao.leetcode;

public class Solution34 {

    public int searchLeft(int[] nums, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (target == nums[mid]) {
            return mid;
        }
        if (nums[right] < target) {

        } else {
            //nums[left]>target;
        }
        searchLeft(nums, target, left, right);
        return -1;
    }

    public int searchRight(int[] nums, int target, int left, int right) {
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{searchLeft(nums, target, 0, nums.length), searchRight(nums, target, 0, nums.length)};
    }
}
