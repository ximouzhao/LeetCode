package com.ximouzhao.leetcode.huaweiHJ19;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//https://www.nowcoder.com/practice/2baa6aba39214d6ea91a2e03dff3fbeb?tpId=37&&tqId=21242&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking
public class Main {
    public static int OUTPUT_LINE_NUM=8;
    public static String regex=".*?([^\\\\/]+)\\s+(\\d+)\\s*$";
    public static void main(String[] args) {
        Map<VO,Integer> errCountMap=new LinkedHashMap<>();
        Scanner in=new Scanner(System.in);
        while (in.hasNextLine()){
            String lineStr=in.nextLine();
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(lineStr);
            VO vo=new VO();
            if(matcher.matches()){
                String filename=matcher.group(1);
                if(filename.length()>16){
                    filename=filename.substring(filename.length()-16);
                }
                vo.setFileName(filename);
                vo.setLineNumber(Integer.valueOf(matcher.group(2)));
                if(errCountMap.containsKey(vo)){
                    Integer count=errCountMap.get(vo);
                    errCountMap.put(vo,count+1);
                }else {
                    errCountMap.put(vo,1);
                }
            }
        }
        Iterator<Map.Entry<VO,Integer>> iterator=errCountMap.entrySet().iterator();
        for(int i=0;i<errCountMap.size();i++){
            Map.Entry<VO,Integer> entry =iterator.next();
            if(i>errCountMap.size()-OUTPUT_LINE_NUM-1){
                System.out.printf("%s %d %d",entry.getKey().getFileName(),entry.getKey().getLineNumber(),entry.getValue());
                System.out.println();
            }
        }
    }
}
class VO{
    private String fileName;
    private Integer lineNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;};
        if (!(o instanceof VO)) {return false;};
        VO vo = (VO) o;
        return getFileName().equals(vo.getFileName()) &&
                getLineNumber().equals(vo.getLineNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFileName(), getLineNumber());
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }
}