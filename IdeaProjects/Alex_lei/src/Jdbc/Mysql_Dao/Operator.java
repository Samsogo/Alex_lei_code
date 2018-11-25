package Jdbc.Mysql_Dao;

import Jdbc.Entity.Emp;

import java.util.List;

public interface Operator {
    //define some abstract methods
    public void add(Emp emp);
    public void deleteby_id(Integer id);
    public void modify(Emp emp);
    public Emp findby_id(Integer id);
    public int getTotal();
    public List<Emp> findby_page(int size,int page);
}
