package Practice.com.pp;

import java.sql.*;
import java.sql.Connection;

public class JdbcUtil {
    private static String url = "jdbc:mysql://localhost:3306/day03";
    private static String username = "root";
    private static String password = "root";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        java.sql.Connection con = DriverManager.getConnection(url,username,password);
        return con;
    }

    public static void closeAll(Connection con, Statement st, ResultSet rs){
        if(rs!=null){
            try{
                rs.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(st!=null){
            try {
                st.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        if(con!=null){
            try {
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }


}
