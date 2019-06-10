package Jdbc.Mysql_Dao;

import Jdbc.Entity.Emp;
import Jdbc.Tools.Dbutil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//implement the operator interface
public class Imp_Ope_Dao implements Operator{

    @Override
    //implement the add method
    public void add(Emp emp) {
        Connection conn = null;
        try{
            conn = Dbutil.getConnection();
            String sql = "insert into emp values(?,?,?,?,?)";
            /**
             * Statement与PreparedStatement的区别
             *
             * 1:Statement执行的是静态sql语句
             * 2:Statement有Sql注入漏洞
             * 3:PreparedStatement是Statement的子类
             * 4:PreparedStatement是预编译sql语句对象
             */
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,emp.getId());
            ps.setString(2,emp.getName());
            ps.setString(3,emp.getJob());
            ps.setInt(4,emp.getSal());
            ps.setInt(5,emp.getComm());
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbutil.closeConnection(conn);
        }
    }

    @Override
    //implement the deleteby_id method
    public void deleteby_id(Integer id) {
        Connection conn = null;
        try{
            conn = Dbutil.getConnection();
            String sql = "delete from emp where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbutil.closeConnection(conn);
        }
    }

    @Override
    //implement the modify method
    public void modify(Emp emp) {
        Connection conn = null;
        try{
            conn = Dbutil.getConnection();
            String sql = "update emp set job = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,emp.getJob());
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbutil.closeConnection(conn);
        }
    }

    @Override
    //implement the findby_id method
    public Emp findby_id(Integer id) {
        Connection conn = null;
        Emp emp = new Emp();
        try{
            conn = Dbutil.getConnection();
            String sql = "select * from emp where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int num = rs.getInt(1);
                String name = rs.getString(2);
                String job = rs.getString(3);
                int sal = rs.getInt(4);
                int comm = rs.getInt(5);
                emp = new Emp(num,name,job,sal,comm);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbutil.closeConnection(conn);
        }
        return emp;
    }

    @Override
    //implement the getTotal method
    public int getTotal() {
        Connection conn = null;
        int ans = 0;
        try{
            conn = Dbutil.getConnection();
            String sql = "select count(*) from emp";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            ans = rs.getInt(1);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbutil.closeConnection(conn);
        }
        return ans;
    }

    @Override
    //implement the findby_page method
    public List<Emp> findby_page(int size,int page) {
        Connection conn = null;
        Emp emp = new Emp();
        List<Emp> list = new ArrayList<>();
        try{
            conn = Dbutil.getConnection();
            String sql = "select * from emp limit ?,?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,(page-1)*size);
            ps.setInt(2,page*size);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String job = rs.getString(3);
                int sal = rs.getInt(4);
                int comm = rs.getInt(5);
                emp = new Emp(id,name,job,sal,comm);
                list.add(emp);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Dbutil.closeConnection(conn);
        }
        return list;
    }
}
