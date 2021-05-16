package com.ximouzhao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HuaweiIpFenlei {
    public static void main(String[] args) {
        int[] result=new int[7];
        Scanner in =new Scanner(System.in);
        while(in.hasNextLine()){
            String toAnalyStr=in.nextLine();
            String[] temp=toAnalyStr.split("~");
            String toAnalyIP=temp[0];
            String toAnalyMask=temp[1];
            //判断ip
            String[] ipArr=toAnalyIP.split("\\.");
            int []convertedIntIP=convertIP(ipArr);
            boolean isMask=isMask(toAnalyMask.split("\\."));
            // 错误的ip和地址
            if(convertedIntIP==null||!isMask){
                result[5]++;
            }else {
                // 分类
                if(convertedIntIP[0]>=1&&convertedIntIP[0]<=126){
                    result[0]++;
                }else if(convertedIntIP[0]>=128&&convertedIntIP[0]<=191){
                    result[1]++;
                }
                else if(convertedIntIP[0]>=192&&convertedIntIP[0]<=223){
                    result[2]++;
                }
                else if(convertedIntIP[0]>=224&&convertedIntIP[0]<=239){
                    result[3]++;
                }
                else if(convertedIntIP[0]>=240&&convertedIntIP[0]<=255){
                    result[4]++;
                }
                //私有ip
                if(convertedIntIP[0]==10
                        ||(convertedIntIP[0]==172&&convertedIntIP[1]>=16&&convertedIntIP[1]<=31)
                        ||(convertedIntIP[0]==192&&convertedIntIP[1]==168)){
                    result[6]++;
                }
            }
        }
        for(int h=0;h<6;h++){
            System.out.print(result[h]+" ");
        }
        System.out.print(result[6]);
    }
    public static int[] convertIP(String[] attr){
        int []convertedIntIP=new int[4];
        if(attr.length!=4){return null;}
        for(int i=0;i<4;i++){
            try{
                int temp=Integer.parseInt(attr[i]);
                if(temp<0||temp>255){
                    return null;
                }else {
                    convertedIntIP[i]=temp;
                }
            }catch (NumberFormatException e){
                return null;
            }
        }
        return convertedIntIP;
    }
    public static boolean isMask(String[] attr){
        // 所有2进制位都是1
        int mask=0;
        if(attr.length!=4){return false;}
        for(int i=0;i<4;i++){
            try{
                int temp=Integer.parseInt(attr[i]);
                if(temp<0||temp>255){
                    return false;
                }else {
                    // 构造掩码
                    mask=mask|(temp<<(8*(3-i)));
                }
            }catch (NumberFormatException e){
                return false;
            }
        }
        if(mask==0||mask==0xffffffff){
            return false;
        }
        //从左侧向右扫描，如果当扫描到1的时候发现前面已经有0了则报错,只扫描一遍即可
        boolean alReadyHaveZero=false;
        for(int i=31;i>0;i--){
            int leftOut=mask&0x80000000;
            if(leftOut==0){
                alReadyHaveZero=true;
            }else if(alReadyHaveZero){
                return false;
            }
            mask=mask<<1;
        }
        return true;
    }
}
