package CourseScheduleII210;

import java.util.*;

class Solution {
    int index=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        index=numCourses-1;
        int[] result=new int[numCourses];
        int[] visited = new int[numCourses];
        List<List<Integer>> tu=new ArrayList<>(numCourses);
        for(int i=0;i<numCourses;i++){
            tu.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            tu.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0){
                if(!dfs(tu,i,visited,result)){
                    return new int[0];
                }
            }
        }
        return result;
    }
    public boolean dfs(List<List<Integer>> tu,int root,int[] visited,int[] result){
        visited[root]=1;
        for(int p:tu.get(root)){
            if(visited[p]==1){
                return false;
            }else if(visited[p]==0){
                if(!dfs(tu,p,visited,result)){
                    return false;
                }
            }
        }
        visited[root]=2;
        result[index--]=root;
        return true;
    }
}