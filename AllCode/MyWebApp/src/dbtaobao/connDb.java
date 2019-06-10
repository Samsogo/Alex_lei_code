package dbtaobao;
import java.sql.*;
import java.util.ArrayList;

public class connDb {
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
 
    //连接数据库方法
    public static void startConn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //连接数据库中间件
            try{
                con = DriverManager.getConnection("jdbc:MySQL://39.105.177.196:3306/bishe","root","LYR199736124.com");
                System.out.println(con);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
 
    //关闭连接数据库方法
    public static void endConn() throws SQLException{
        if(con != null){
            con.close();
            con = null;
        }
        if(rs != null){
            rs.close();
            rs = null;
        }
        if(stmt != null){
            stmt.close();
            stmt = null;
        }
    }
    //数据库双11 所有买家消费行为比例
    public static ArrayList index() throws SQLException{
        ArrayList<String[]> list = new ArrayList();
        startConn();
        stmt = con.createStatement();
        rs = stmt.executeQuery("select * from bishe_rpt_proportion_of_consumer_behavior");
        while(rs.next()){
            String[] temp={rs.getString("action"),rs.getString("num")};
            list.add(temp);
        }
            endConn();
        return list;
    }
    //男女买家交易对比
        public static ArrayList index_1() throws SQLException{
            ArrayList<String[]> list = new ArrayList();
            startConn();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from bishe_rpt_comparison_of_male_and_female_transactions");
            while(rs.next()){
                String[] temp={rs.getString("gender"),rs.getString("num")};
                list.add(temp);
            }
            endConn();
            return list;
        }
        //男女买家各个年龄段交易对比
        public static ArrayList index_2() throws SQLException{
            ArrayList<String[]> list = new ArrayList();
            startConn();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from bishe_rpt_comparison_of_male_and_female_buyers_of_all_ages where gender in (0,1) order by gender desc,age_range");
            while(rs.next()){
                String[] temp={rs.getString("gender"),rs.getString("age_range"),rs.getString("num")};
                list.add(temp);
            }
            endConn();
            return list;
        }
        //获取销量前十的商品类别
        public static ArrayList index_3() throws SQLException{
            ArrayList<String[]> list = new ArrayList();
            startConn();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from get_the_top_ten_product_categories_for_sales ORDER BY num desc");
            while(rs.next()){
                String[] temp={rs.getString("cat_id"),rs.getString("num")};
                list.add(temp);
            }
            endConn();
            return list;
        }
    //各个月份的交易量
    public static ArrayList index_4() throws SQLException{
        ArrayList<String[]> list = new ArrayList();
        startConn();
        stmt = con.createStatement();
        rs = stmt.executeQuery("select * from bishe_month_total_num ORDER BY `month`");
        while(rs.next()){
            String[] temp={rs.getString("month"),rs.getString("num")};
            list.add(temp);
        }
        endConn();
        return list;
    }

    public static void main(String[] args) {
        startConn();
    }
}
