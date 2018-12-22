package com.it.sql;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class Practiceday03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//      注册驱动
        DriverManager.registerDriver(new Driver() {
            @Override
            public Connection connect(String url, Properties info) throws SQLException {
                return null;
            }

            @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            }

            @Override
            public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                return new DriverPropertyInfo[0];
            }

            @Override
            public int getMajorVersion() {
                return 0;
            }

            @Override
            public int getMinorVersion() {
                return 0;
            }

            @Override
            public boolean jdbcCompliant() {
                return false;
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        });
//      获取connection连接对象
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day03_1","root","root");
//        编写sql语句
        String sql = "select *from category";
//        获取statement对象
        Statement st = con.createStatement();
//        执行sql语句
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            Integer cid = rs.getInt("cid");
            String cname = rs.getString("cname");
            System.out.println("cid"+cid+",cname"+cname);
        }
        rs.close();
        st.close();
        con.close();



    }
}
