package CarPooling1094;

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] charge=new int[100];
        for(int [] per:trips){
            charge[per[1]]+=per[0];
            charge[per[2]]-=per[0];
        }
        int sum=0;
        for(int i=0;i<100;i++){
            sum+=charge[i];
            if(sum>capacity){
                return false;
            }
        }
        return true;
    }
}