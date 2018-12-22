

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
//    public static void main(String[] args) throws SQLException {
//    Connection con = JDBCUtils.getConnectio();
//    String sql = "insert into product values(15,'电脑',2000.00,'c20')";
//    Statement st = con.createStatement();
//    int count = st.executeUpdate(sql);
//    System.out.println(count);
//
//    JDBCUtils.closeAll(con,st,null);
//    }

    @Test
    public void add() throws SQLException {
        Connection con = JDBCUtils.getConnectio();

        String sql = "update product set pname = ? where pid = ?";

        PreparedStatement pst = con.prepareStatement(sql);


        pst.setString(1,"红酒");
        pst.setInt(2,13);

        int count = pst.executeUpdate();
        System.out.println(count);
        JDBCUtils.closeAll(con,pst,null);

    }
}
