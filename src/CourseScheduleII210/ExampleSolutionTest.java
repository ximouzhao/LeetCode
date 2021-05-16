package CourseScheduleII210;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ExampleSolutionTest {

    @org.junit.Test
    public void findOrder() {
        int numCourses=4;
        int [][]prerequisites=new int[][]{
                {1,0},{2,0},{3,1},{3,2}
        };
        int[] result=new ExampleSolution().findOrder(numCourses,prerequisites);
        System.out.println(result);
    }
    @org.junit.Test
    public void findOrder1() {
        int numCourses=4;
        int [][]prerequisites=new int[][]{
                {1,0},{2,0},{0,3},{2,3}
        };
        int[] result=new ExampleSolution().findOrder(numCourses,prerequisites);
        System.out.println(Arrays.toString(result));
    }
    @org.junit.Test
    public void findOrder3() {
        int numCourses=4;
        int [][]prerequisites=new int[][]{
                {1,0}
        };
        int[] result=new ExampleSolution().findOrder(numCourses,prerequisites);
        System.out.println(Arrays.toString(result));
    }
}