package Collection.Exercise.list_emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Author:Alex_lei
 * Description:create a list and save three objects of Emp,sort it.
 */
public class Test_Emp {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        Emp emp1 = new Emp("Bob",12);
        Emp emp2 = new Emp("Lily",16);
        Emp emp3 = new Emp("Tim",15);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sort:"+list);
        Comparator comparator = new Comparator<Emp>(){
            public int compare(Emp emp1,Emp emp2){
                return emp1.getAge()-emp2.getAge();
            }
        };
        Collections.sort(list,comparator);
        System.out.println("After sort:"+list);
    }
}
