package Jdbc.Tools;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Dbutil {
    public static String url;
    public static String username;
    public static String password;
    public static String driver;
    static {
        // 读取数据库的配置文件信息
        try {
            //1:创建Properties类型
            Properties properties = new Properties();
            FileReader fr = new FileReader("db.properties");
            /**
             *
             * 通过当前类的类加载器所获取的流读取配置文件
             * 类加载器获取的流：默认当前路径为src下
             *
             * */
//			InputStream is =
//					DBUtil.class.getClassLoader()
//			.getResourceAsStream("db.properties");
            //3：加载流信息，将文件中的数据封装到prop对象上
            properties.load(fr);
            //4：分析prop
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");
            //5:加载驱动
            Class.forName(driver);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //获取数据库连接对象
    public static Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    //关闭数据库连接对象
    public static void closeConnection(Connection conn){
        if(conn!=null){
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    //测试数据库是否连接成功
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
