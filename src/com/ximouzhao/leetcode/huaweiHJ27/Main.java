package com.ximouzhao.leetcode.huaweiHJ27;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int count=scanner.nextInt();
            Map<String, List<String>> brotherDictory=new HashMap<>();
            for(int i=0;i<count;i++){
                String word=scanner.next();
                char []wordCharArr=word.toCharArray();
                Arrays.sort(wordCharArr);
                String soredStr=new String(wordCharArr);
                if(brotherDictory.containsKey(soredStr)){
                    brotherDictory.get(soredStr).add(word);
                }else {
                    List<String> brotherList=new ArrayList<>();
                    brotherList.add(word);
                    brotherDictory.put(soredStr,brotherList);
                }
                brotherDictory.get(soredStr).sort(String::compareTo);
            }
            String toSearchWord=scanner.next();
            char []wordCharArr=toSearchWord.toCharArray();
            Arrays.sort(wordCharArr);
            String soredStr=new String(wordCharArr);

            List<String> brotherList=brotherDictory.get(soredStr);
            int toLocateNum=scanner.nextInt();
            if(brotherList==null){
                System.out.println(0);
                continue;
            }
            int trueLocateNum=0;
            String trueBrotherStr="";
            for (String getFromListStr : brotherList) {
                if (!toSearchWord.equals(getFromListStr)) {
                    trueLocateNum++;
                    if (trueLocateNum == toLocateNum) {
                        trueBrotherStr=getFromListStr;
                    }
                }
            }
            System.out.println(trueLocateNum);
            if(trueLocateNum>=toLocateNum){
                System.out.println(trueBrotherStr);
            }
        }
        scanner.close();
    }
}
