package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author:Alex_lei
 * description:create a list and save three points,sort them.
 */
public class ListDemo03 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        Point p1 = new Point(3,1);
        Point p2 = new Point(2,3);
        Point p3 = new Point(2,1);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println("Before Sort:"+list);
        Collections.sort(list);
        System.out.println("After sort:"+list);
    }
}

class Point implements Comparable<Point>{

    private int x;
    private int y;

    public Point(){}
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x!=o.x)
            return this.x - o.x;
        else
            return this.y - o.y;
    }
}
