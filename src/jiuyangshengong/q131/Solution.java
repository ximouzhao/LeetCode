package jiuyangshengong.q131;

public class Solution {
    public static void main(String[] args) {
        int n=3;
        int[] memo =new int[n];
        System.out.println(new Solution().climbStairs(n,memo));
    }
    int climbStairs(int n, int[] memo){
        if(n==1) {
            return 1;
        }
        if(n==2) {
            return 2;
        }
        if(memo[n-1]>0){
            return memo[n-1];
        }
        memo[n-1]=climbStairs(n-1,memo)+climbStairs(n-2,memo);
        return memo[n-1];

    }
}
