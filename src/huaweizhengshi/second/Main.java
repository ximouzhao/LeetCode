package huaweizhengshi.second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String inputStr=scanner.nextLine().trim();
            int begin=Integer.parseInt(scanner.nextLine());
            int end=Integer.parseInt(scanner.nextLine());
            String[] strArr=inputStr.split("\\s+");
            if(strArr.length==1||begin-end>=0||end>strArr.length-1||begin<0){
                System.out.println("EMPTY");
                continue;
            }
            StringBuilder stringBuilder=new StringBuilder();
            for (int i=0;i<begin;i++){
                stringBuilder.append(strArr[i]).append(" ");
            }
            for (int i=end;i>=begin;i--){
                stringBuilder.append(strArr[i]).append(" ");
            }
            for (int i=end+1;i<strArr.length;i++){
                stringBuilder.append(strArr[i]).append(" ");
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            System.out.println(stringBuilder.toString());
        }
    }
}
