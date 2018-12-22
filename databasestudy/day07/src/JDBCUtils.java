import java.sql.*;

public class JDBCUtils {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/day04";
    private static String username = "root";
    private static String password = "root";


    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static Connection getConnectio() throws SQLException {
        Connection con = DriverManager.getConnection(url,username,password);
        return con;
    }



    public static void closeAll(Connection con, PreparedStatement pst, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        if(pst != null){
            try {
                pst.close();
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


}
