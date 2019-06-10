package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Author:Alex_lei
 * Description:create a list and save three points,sort them by Comparator
 */
public class ListDemo04 {
    public static void main(String[] args) {
        List<point> list = new ArrayList<>();
        point p1 = new point(2,3);
        point p2 = new point(3,1);
        point p3 = new point(2,2);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println("Before sort:"+list);
        Comparator comparator = new Comparator<point>() {
            @Override
            public int compare(point o1,point o2) {
                if(o1.getX()!=o2.getX())
                    return o1.getX()-o2.getX();
                else
                    return o2.getY()-o1.getY();
            }
        };
        Collections.sort(list,comparator);
        System.out.println("After sort:"+list);
    }
}

class point{
    private int x;
    private int y;

    public point(){}
    public point(int x,int y){
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
        point point = (point) o;
        return x == point.x &&
                y == point.y;
    }


    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
