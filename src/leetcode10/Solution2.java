package leetcode10;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(new Solution2().isMatch("aabb",".a*"));
    }
    public boolean isMatch(String s, String p) {
        // S串当前下标位置，刚开始为0
        int sIndex=0;
        // 下一状态集合
        Set<Integer> nextStateSet = new HashSet<>();
        nextMatch(p,0,nextStateSet);
        while (!nextStateSet.isEmpty()){
            Set<Integer> nowStateSet=nextStateSet;
            // 创建新的nextState
            nextStateSet = new HashSet<>();
            for( int pIndex:nowStateSet){
                if(pIndex >= p.length()&& sIndex>=s.length()){
                    return true;
                }else if(pIndex >= p.length()){

                }else if(sIndex<s.length()){
                    //
                    if(p.charAt(pIndex) == '.' || s.charAt(sIndex)== p.charAt(pIndex)){
                        if(pIndex+1 < p.length() && p.charAt( pIndex+1)== '*'){
                            nextMatch(p,pIndex,nextStateSet);
                        }else {
                            nextMatch(p,pIndex +1,nextStateSet);
                        }
                    }
                }
            }
            sIndex++;
        }
        return false;
    }
    // p:正则表达式
    // state： 下一个状态
    // nextStateSet:下一个状态集合，无重复
    private void nextMatch(String p,int pIndex, Set<Integer> nextStateSet){
        // 首先加上下一个状态到状态集中
        nextStateSet.add(pIndex);
        if(pIndex+1<p.length()&&p.charAt(pIndex+1)=='*'){
            nextMatch(p,pIndex+2,nextStateSet);
        }
    }

}
