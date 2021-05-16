package com.ximouzhao.leetcode.huaweiHJ28;

import java.util.*;

public class Main {
    public static Map<List<Integer>,Integer> dyncmicGuihuaMap=new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n=scanner.nextInt();
            List<Integer> list=new ArrayList<>();
            int i=0;
            while (scanner.hasNextInt()){
                i++;
                list.add(scanner.nextInt());
                if(i==n){
                    break;
                }
            }
            System.out.println(getSushuBanLvCount(list));
        }
    }
    // 动态规划
    public static int getSushuBanLvCount(List<Integer> list){
        if(dyncmicGuihuaMap.containsKey(list)){
            return dyncmicGuihuaMap.get(list);
        }
        if(list.size()<2){
            dyncmicGuihuaMap.put(list,0);
            return 0;
        }
        if(list.size()==2){
            int toReturn= isSushu(list.get(0)+list.get(1))?1:0;
            dyncmicGuihuaMap.put(list,toReturn);
            return toReturn;
        }
        int maxNum=0;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                 if(i==j){
                     continue;
                 }
                 Integer first=list.get(i);
                 Integer second=list.get(j);
                 if(isSushu(first+second)){
                     //System.out.printf("%d %d\n",first,second);
                     List<Integer> newList = new ArrayList<>(list);
                     Collections.copy(newList,list);
                     newList.remove(first);
                     newList.remove(second);
                     int returnNum=getSushuBanLvCount(newList)+1;
                     maxNum= Math.max(returnNum, maxNum);
                 }
            }
        }
        dyncmicGuihuaMap.put(list,maxNum);
        return maxNum;
    }
    public static boolean isSushu(int num){
        for(int i=2;i<num;i++){
            int yushu=num%i;
            if(yushu==0){
                return false;
            }
        }
        return true;
    }

}
