package com.ximouzhao.leetcode;

public class Solution65 {
    public static void main(String[] args) {
        System.out.println(new Solution65().isNumber("6e+6"));
    }
    public boolean isNumber(String s) {
        s=s.trim();
        if(s==null||s.equals("")){
            return false;
        }
        if(s.endsWith("e")||s.endsWith("e.")||s.endsWith("e+")||s.endsWith("e-")){
            return false;
        }
        boolean isStart=false;
        boolean isDightStart=false;
        boolean isContainsE=false;
        boolean isContainsDot=false;
        int length=s.length();
        for(int i=0;i<length;i++){
            char c=s.charAt(i);
            if(!isStart){
                if(c==' '){
                    continue;
                }
                else if(c=='+'||c=='-'){
                    isStart=true;
                }
                else if(c>='0'&&c<='9'){
                    isStart=true;
                    isDightStart=true;
                }else if(c=='.'){
                    isStart=true;
                    isContainsDot=true;
                }
                else {
                    return false;
                }
            }else {
                if(!isDightStart){
                    if(c=='.'){
                        if(!isContainsDot){
                            isContainsDot=true;
                        }else {
                            return false;
                        }
                    }else if(c<'0'||c>'9'){
                        return false;
                    }else if(c>='0'&&c<='9'){
                        isDightStart=true;
                    }
                }else {
                    if(c=='-'||c=='+'){
                        if(s.charAt(i-1)=='e'){
                            continue;
                        }else {
                            return false;
                        }
                    }else if(c>='0'&&c<='9'){
                        isDightStart=true;
                        continue;
                    }else if(c=='e'){
                        if(!isContainsE){
                            isContainsE=true;
                        }else {
                            return false;
                        }
                    }else if(c=='.'){
                        if(isContainsE){
                            return false;
                        }
                        if(!isContainsDot){
                            isContainsDot=true;
                        }else {
                            return false;
                        }
                    }else {
                        return false;
                    }
                }
            }
        }
        return isDightStart;
    }
}
