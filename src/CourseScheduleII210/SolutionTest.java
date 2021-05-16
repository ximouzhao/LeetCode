package CourseScheduleII210;

import org.junit.Test;

import java.util.Arrays;


public class SolutionTest {

    @Test
    public void findOrder() {
        int numCourses=4;
        int [][]prerequisites=new int[][]{
                {1,0},{2,0},{3,1},{3,2}
        };
        int[] result=new Solution().findOrder(numCourses,prerequisites);
        System.out.println(Arrays.toString(result));
    }
    @Test
    public void findOrder2() {
        int numCourses=2;
        int [][]prerequisites=new int[][]{
                {1,0}
        };
        int[] result=new Solution().findOrder(numCourses,prerequisites);
        System.out.println(Arrays.toString(result));
    }
    @Test
    public void findOrder3() {
        int numCourses=2;
        int [][]prerequisites=new int[][]{
        };
        int[] result=new Solution().findOrder(numCourses,prerequisites);
        System.out.println(Arrays.toString(result));
    }
}