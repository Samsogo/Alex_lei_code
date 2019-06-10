package Jdbc.Test;

import Jdbc.Entity.Emp;
import Jdbc.Mysql_Dao.Imp_Ope_Dao;
import Jdbc.Mysql_Dao.Operator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test_Mysql{
    @Test
    public void test_add(){
        Emp emp = new Emp(112,"kkk","Police",1999,100);
        Operator op = new Imp_Ope_Dao();
        op.add(emp);
    }

    @Test
    public void test_getTotal(){
        Operator op = new Imp_Ope_Dao();
        int count = op.getTotal();
        System.out.println(count);
    }

    @Test
    public void test_deleteby_id(){
        Operator op = new Imp_Ope_Dao();
        op.deleteby_id(103);
    }

    @Test
    public void test_findby_id(){
        Operator op = new Imp_Ope_Dao();
        Emp emp = op.findby_id(104);
        System.out.println(emp);
    }

    @Test
    public void test_findByPage(){
        Operator op = new Imp_Ope_Dao();
        List<Emp>  list= new ArrayList<>();
        list = op.findby_page(2,2);
        for (Emp i:list){
            System.out.println(i);
        }
    }
}

