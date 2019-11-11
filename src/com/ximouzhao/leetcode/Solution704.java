package com.ximouzhao.leetcode;

public class Solution704 {
    public static void main(String[] args) {
        int []nums=new int[]{0,1,2,3,4,5,6,7,8,9,10,11};
        int returnValue=new Solution704().search(nums,11);
        System.out.println(returnValue);
        returnValue=new Solution704().search(nums,0,nums.length-1,11);
        System.out.println(returnValue);
        nums=new int[]{0};
        returnValue=new Solution704().search(nums,1);
        System.out.println(returnValue);
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);
    }
    private int binarySearch(int []nums,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid=(left+(right))/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]>target){
            return binarySearch(nums,target,left,mid-1);
        }else{
            return binarySearch(nums,target,mid+1,right);
        }
    }
    private int search(int[] nums, int l, int r, int target) {
        if (l > r) {
            return -1;
        }
        int mid = l + (r - l) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return search(nums, l, mid - 1, target);
        } else {
            return search(nums, mid + 1, r, target);
        }
    }

}
