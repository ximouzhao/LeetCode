package huaweizhengshi.mianshi;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> pointList=new ArrayList<>();
        Point p1=new Point(1,2);
        Point p2=new Point(2,3);
        Point p3=new Point(3,4);
        pointList.add(p1);
        pointList.add(p2);
        pointList.add(p3);
        List<Point> result=getNearestPoint(pointList,2);
        int a=3;
    }
    public static List<Point> getNearestPoint(List<Point> inPoints,int num){
        inPoints.sort(Point::compareTo);
        return inPoints.subList(0,num);
    }
}
class Point implements Comparable<Point>{
    @Override
    public int compareTo(Point o) {
        return this.getDistance().compareTo(o.getDistance());
    }
    public Integer getDistance(){        return x*x+y*y;    }
    private int x;
    private int y;
    public Point(int x, int y) {        this.x = x;        this.y = y;    }
    public int getX() {        return x;    }
    public void setX(int x) {        this.x = x;    }
    public int getY() {        return y;    }
    public void setY(int y) {        this.y = y;    }
}