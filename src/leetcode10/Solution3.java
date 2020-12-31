package leetcode10;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println(new Solution3().isMatch("aa","a.*"));
    }
    public boolean isMatch(String s, String p) {
        return isMatch(s.toCharArray(),p.toCharArray(),0,0);
    }
    public boolean isMatch(char []s,char[] p,int sIndex,int pIndex){
        if(sIndex==s.length&&pIndex==p.length){
            return true;
        }
        if(p[pIndex+1]=='*'){
            //
            if(isMatch(s,p,++sIndex,pIndex+1)){
                return true;
            }else {
                //
                return isMatch(s,p,++sIndex,pIndex);
            }
        }
        if(s[sIndex]==p[pIndex]||p[pIndex]=='.'){
            return isMatch(s,p,++sIndex,++pIndex);
        }else if(p[pIndex]=='*'){
            return isMatch(s,p,++sIndex,pIndex-1);
        }else {
            return false;
        }
    }
}
