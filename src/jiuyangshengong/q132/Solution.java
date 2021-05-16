package jiuyangshengong.q132;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n=10;
        System.out.println(100000008%100000007);
        int[] memo=new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println();
    }
    public int jump(int n,int []  memo){
        if(memo[n]!=-1){
            return memo[n];
        }
        if (n == 1 || n == 0) {
            return 1;
        }
        memo[n]=(jump(n-1,memo)+jump(n-2,memo)%1000_000_007);
        return memo[n];
    }
}
