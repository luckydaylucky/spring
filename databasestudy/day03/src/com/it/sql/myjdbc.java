package com.it.sql;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class myjdbc {
    public static void main(String[] args) throws SQLException {
//        新建驱动
//        DriverManager.registerDriver(new Driver() {
//            @Override
//            public Connection connect(String url, Properties info) throws SQLException {
//                return null;
//            }
//
//            @Override
//            public boolean acceptsURL(String url) throws SQLException {
//                return false;
//            }
//
//            @Override
//            public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
//                return new DriverPropertyInfo[0];
//            }
//
//            @Override
//            public int getMajorVersion() {
//                return 0;
//            }
//
//            @Override
//            public int getMinorVersion() {
//                return 0;
//            }
//
//            @Override
//            public boolean jdbcCompliant() {
//                return false;
//            }
//
//            @Override
//            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
//                return null;
//            }
//        });

        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/day02","root","root");
        String sql = "select * from province";
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            int pid = rs.getInt("pid");
            String pname = rs.getString("pname");
            System.out.println("pid"+pid+", pname"+pname);
        }

        connect.close();
        st.close();
        rs.close();


    }
}
