package com.ximouzhao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution93 {
    public static void main(String[] args) {
        String s="25525511135";
        List<String> succList=new Solution93().restoreIpAddresses(s);
        for(String addr:succList){
            System.out.println(addr);
        }
    }
    Integer parseSeg(String s,int start,int end){
        if(end-start>1&&s.charAt(start)=='0'){
            return null;
        }else {
            return Integer.valueOf(s.substring(start,end));
        }
    }
    public boolean validIp(String s,int a,int b,int c){

        Integer seg1=parseSeg(s,0,a);
        Integer seg2=parseSeg(s,a,b);
        Integer seg3=parseSeg(s,b,c);
        Integer seg4=parseSeg(s,c,s.length());
        if(seg1==null||seg2==null||seg3==null||seg4==null){
            return false;
        }
        if(seg1<=255&&seg2<=255&&seg3<=255&&seg4<=255){
            return true;
        }else {
            return false;
        }

    }
    public String toIpStr(String s,int a,int b,int c){
        StringBuffer sb=new StringBuffer();
        sb.append(s,0,a).append(".")
                .append(s,a,b).append(".")
                .append(s,b,c).append(".")
                .append(s.substring(c));
        return sb.toString();
    }
    public List<String> restoreIpAddresses(String s){
        List<String> succList=new ArrayList<>();
        recursion(s,1,2,3,succList);
        return succList;
    }
    public void recursion(String s,int a,int b,int c,List<String> succList) {
        int length=s.length();
        if(length>12||c>=s.length()){
            return ;
        }
        if(a>3||b>6||c>9){
            return;
        }
        if(b-a==0||c-b==0){
            return;
        }
        //System.out.println(toIpStr(s,a,b,c));
        if(validIp(s,a,b,c)){
            succList.add(toIpStr(s,a,b,c));
        }
        recursion(s,a,b,c+1,succList);
        recursion(s,a,b+1,c+1,succList);
        recursion(s,a+1,b+1,c+1,succList);
        return ;
    }
}
