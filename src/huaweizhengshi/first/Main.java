package huaweizhengshi.first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int totalNum=scanner.nextInt();
            int [] nums=new int[totalNum];
            int [] outPuts=new int[totalNum];
            for(int i=0;i<totalNum;i++){
                nums[i]=scanner.nextInt();
            }
            for(int j=0;j<totalNum;j++){
                for (int h=j+1;h<totalNum;h++){
                    if(nums[j]<nums[h]){
                        outPuts[j]=h;
                        break;
                    }
                }
            }
            for(int k=0;k<totalNum-1;k++){
                System.out.print(outPuts[k]+" ");
            }
            System.out.println(outPuts[totalNum-1]);
        }
    }
}
