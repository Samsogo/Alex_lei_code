package Collection.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Author:Alex_lei
 * Description:create a set and save two objects of Point.
 */

public class SetDemo02 {
    public static void main(String[] args) {

        Set<Point> set = new HashSet<>();
        Point p1 = new Point(1,2);
        Point p2 = new Point(2,1);

        set.add(p1);
        set.add(p2);

        System.out.println(set);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(set.size());

        /**
         * 使用set集合时，需要重写equals()和hashcode()方法
         * 当添加元素时，会先计算hashcode，如果不一样就添加
         * 如果集合中存在相同的hashcode值，就会在调用equals()方法比较，
         * 如果返回true，就不添加，如果返回false，就会添加。
         */
    }
}

class Point{

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
