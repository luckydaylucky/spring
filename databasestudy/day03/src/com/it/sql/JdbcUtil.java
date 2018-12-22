package com.it.sql;



import java.sql.*;

/**
 * JDBC的工具类 -- 方法都是静态的
 * 提供两个方法: 1.获取连接   2.关闭资源
 * 加载驱动,我们写在static代码块中
 */
public class JdbcUtil {
    private static String url = "jdbc:mysql://localhost:3306/day03";
    private static String username = "root";
    private static String password = "root";

    //加载驱动
    // 静态代码块的特点: 随着类的加载而加载; 只加载一次; 加载的时机优先对象
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //1.获取连接
    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);
        return con;
    }


    //2.关闭资源
    //关闭哪些资源: Connection 连接对象   Statement 语句执行对象   ResultSet结果集对象
    //后开的资源先关闭,先开的资源后关闭 (建议)
    public static void  closeAll(Connection con, Statement st, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(st !=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //Juint 单元测试(类似于mian方法)


}